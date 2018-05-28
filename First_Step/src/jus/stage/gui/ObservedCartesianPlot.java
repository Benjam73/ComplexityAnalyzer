package jus.stage.gui;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import jus.stage.kernel.LinearRegression;
import jus.stage.samples.BubbleSort;
import jus.stage.samples.DichotomicSearch;
import jus.stage.samples.MergeSort;
import jus.stage.utils.Settings;

public class ObservedCartesianPlot extends Application {

	/**
	 * Mostly based on :
	 * https://docs.oracle.com/javafx/2/charts/line-chart.htm#CIHGBCFI
	 */
	@Override
	public void start(Stage stage) {

		stage.setTitle("CPU time in function of array size for each samples");
		// defining the axes
		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Array size");
		yAxis.setLabel("CPU time");

		// creating the chart
		final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

		lineChart.setTitle("CPU time in function of array size for each samples");

		// defining a series
		XYChart.Series seriesMergeSort = new XYChart.Series();
		XYChart.Series seriesBubbleSort = new XYChart.Series();
		XYChart.Series seriesDicho = new XYChart.Series();

		seriesMergeSort.setName("Merge Sort");
		seriesBubbleSort.setName("Bubble Sort");
		seriesDicho.setName("Dichotomic Search");

		for (String param : getParameters().getRaw()) {

			// populating the series with data

			double[] result = new double[Settings.precisionNeeded + 1];
			HashMap<Integer, Long> samples = new HashMap<>();
			try {
				result = LinearRegression.run(param);

				Class<?> algorithm = Class.forName("jus.stage.samples." + param);
				if (algorithm == MergeSort.class) {
					samples = MergeSort.getSamples(Settings.nbSample);
					for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
						seriesMergeSort.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
					}
				}
				if (algorithm == BubbleSort.class) {
					samples = BubbleSort.getSamples(Settings.nbSample);
					for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
						seriesBubbleSort.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
					}
				}
				if (algorithm == DichotomicSearch.class) {
					samples = DichotomicSearch.getSamples(Settings.nbSample);
					for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
						seriesDicho.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
					}

				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}

			System.out.println("\n");
		}

		Scene scene = new Scene(lineChart, 800, 600);

		lineChart.getData().addAll(seriesMergeSort, seriesBubbleSort, seriesDicho);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
