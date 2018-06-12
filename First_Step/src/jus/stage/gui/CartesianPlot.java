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
import jus.stage.samples.MatrixProduct;
import jus.stage.samples.MergeSort;
import jus.stage.samples.PowerPlantN;
import jus.stage.samples.PowerPlantNSquare;
import jus.stage.utils.Settings;

/**
 * The CartesianPlot class is used to have a graphical view of the results
 * obtained
 * 
 * @author Benjamin Besnier
 * @version 1.0
 * 
 */

public class CartesianPlot extends Application {

	/**
	 * Mostly based on :
	 * https://docs.oracle.com/javafx/2/charts/line-chart.htm#CIHGBCFI
	 */
	@Override
	public void start(Stage stage) {

		for (String param : getParameters().getRaw()) {
			stage.setTitle(param);
			// defining the axes
			final NumberAxis xAxis = new NumberAxis();
			final NumberAxis yAxis = new NumberAxis();
			xAxis.setLabel("Array size");
			yAxis.setLabel("CPU time");

			// creating the chart
			final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

			lineChart.setTitle("CPU time in function of array size for " + param);
			// defining a series
			XYChart.Series series1 = new XYChart.Series();
			XYChart.Series series2 = new XYChart.Series();
			series1.setName("Valeurs obtenues");
			series2.setName("Linear regression");
			// populating the series with data

			double[] result = new double[Settings.precisionNeeded + 1];
			HashMap<Integer, Long> samples = new HashMap<>();
			try {
				result = LinearRegression.run(param);

				// Choosing the sample to run
				Class<?> algorithm = Class.forName("jus.stage.samples." + param);
				if (algorithm == MergeSort.class) {
					samples = MergeSort.getSamples(Settings.nbSample);
				}
				if (algorithm == BubbleSort.class) {
					samples = BubbleSort.getSamples(Settings.nbSample);
				}
				if (algorithm == DichotomicSearch.class) {
					samples = DichotomicSearch.getSamples(Settings.nbSample);
				}
				if (algorithm == PowerPlantN.class) {
					samples = PowerPlantN.getSamples(Settings.nbSample);
				}
				if (algorithm == PowerPlantNSquare.class) {
					samples = PowerPlantNSquare.getSamples(Settings.nbSample);
				}
				if (algorithm == MatrixProduct.class) {
					samples = MatrixProduct.getSamples(Settings.nbSample);
				}
				int sizeMax = 0;
				int sizeMin = 10000000;
				for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
					if (entry.getKey() > sizeMax) {
						sizeMax = entry.getKey();
					}
					if (entry.getKey() < sizeMin) {
						sizeMin = entry.getKey();
					}
					series1.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
				}

				for (double i = sizeMin; i <= sizeMax; i += (sizeMax - sizeMin) / 1000) {
					double sum = 0;
					sum += result[0];
					// System.out.println("sum : " + sum);
					sum += result[1] * Math.log(i);
					// System.out.println("sum : " + sum);
					sum += result[2] * i;
					// System.out.println("sum : " + sum);
					sum += result[3] * (double) ((double) i * (double) Math.log(i));
					// System.out.println("sum : " + sum);
					sum += result[4] * (double) ((double) i * (double) i);
					// System.out.println("sum : " + sum);
					sum += result[5] * (double) ((double) i * (double) i * (double) Math.log(i));

					sum += result[6] * (double) ((double) i * (double) i * (double) i);

					series2.getData().add(new XYChart.Data<>(i, sum));
				}

				// double sum = 0;

				// double tmp = 0;
				// tmp = Double.MAX_VALUE;

				// System.out.println("key : " + entry.getKey());
				// System.out.println("sum : " + sum);
				// sum += result[0];
				// // System.out.println("sum : " + sum);
				// sum += result[1] * Math.log(entry.getKey());
				// // System.out.println("sum : " + sum);
				// sum += result[2] * entry.getKey();
				// // System.out.println("sum : " + sum);
				// sum += result[3] * (double) ((double) entry.getKey() *
				// (double) Math.log(entry.getKey()));
				// // System.out.println("sum : " + sum);
				// sum += result[4] * (double) ((double) entry.getKey() *
				// (double) entry.getKey());
				// // System.out.println("sum : " + sum);
				// sum += result[5] * (double) ((double) entry.getKey() *
				// (double) entry.getKey()
				// * (double) Math.log(entry.getKey()));
				// // System.out.println("sum : " + sum);
				// sum += result[6]
				// * (double) ((double) entry.getKey() * (double) entry.getKey()
				// * (double) entry.getKey());

				Scene scene = new Scene(lineChart, 800, 600);

				lineChart.getData().addAll(series1, series2);
				stage.setScene(scene);
				stage.show();

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}

			System.out.println("\n");
		}

	}

	/**
	 * 
	 * @param args
	 *            The sample we want to run, precised in the running
	 *            configuration
	 */
	public static void main(String[] args) {
		launch(args);
	}
}