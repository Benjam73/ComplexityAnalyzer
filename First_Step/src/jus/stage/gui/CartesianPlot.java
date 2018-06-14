package jus.stage.gui;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import jus.stage.kernel.Features;
import jus.stage.kernel.LinearRegression;
import jus.stage.kernel.LinearRegressionLog;
import jus.stage.kernel.LinearRegressionN;
import jus.stage.kernel.LinearRegressionNLog;
import jus.stage.kernel.LinearRegressionNSquare;
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
			XYChart.Series seriesObserved = new XYChart.Series();
			XYChart.Series seriesResult = new XYChart.Series();
			XYChart.Series seriesLog = new XYChart.Series();
			XYChart.Series seriesN = new XYChart.Series();
			XYChart.Series seriesNLog = new XYChart.Series();
			XYChart.Series seriesNSquare = new XYChart.Series();

			seriesObserved.setName("Values obtained");
			seriesResult.setName("Linear regression");
			seriesLog.setName("Linear regression Log");
			seriesN.setName("Linear regression N");
			seriesNLog.setName("Linear regression NLog");
			seriesNSquare.setName("Linear regression N^2");

			// populating the series with data

			double[] result = new double[Settings.precisionNeeded + 1];
			HashMap<Double, Long> observedValue = new HashMap<>();
			HashMap<double[], Long> featuresMap = new HashMap<>();
			double[] resultLog = new double[2];
			double[] resultN = new double[2];
			double[] resultNLog = new double[2];
			double[] resultNSquare = new double[2];

			try {

				// Choosing the sample to run
				Class<?> algorithm = Class.forName("jus.stage.samples." + param);
				if (algorithm == MergeSort.class) {
					System.out.println("---------- Merge Sort ----------");
					featuresMap = MergeSort.getObservation();
				}
				if (algorithm == BubbleSort.class) {
					System.out.println("---------- Bubble Sort ----------");
					featuresMap = BubbleSort.getObservation();
				}
				if (algorithm == DichotomicSearch.class) {
					System.out.println("---------- DichotomicSearch ----------");
					featuresMap = DichotomicSearch.getObservation();
				}
				if (algorithm == PowerPlantN.class) {
					System.out.println("---------- Power Plant N ----------");
					featuresMap = PowerPlantN.getObservation();
				}
				if (algorithm == PowerPlantNSquare.class) {
					System.out.println("---------- Power Plant N Square ----------");
					featuresMap = PowerPlantNSquare.getObservation();
				}
				if (algorithm == MatrixProduct.class) {
					System.out.println("---------- Matrix Product ----------");
					featuresMap = MatrixProduct.getObservation();
				}

				observedValue = Features.getWantedFeature(featuresMap, 1);
				result = LinearRegression.run(featuresMap);
				resultLog = LinearRegressionLog.doLinearRegression(featuresMap);
				resultN = LinearRegressionN.doLinearRegression(featuresMap);
				resultNLog = LinearRegressionNLog.doLinearRegression(featuresMap);
				resultNSquare = LinearRegressionNSquare.doLinearRegression(featuresMap);

				double sizeMax = 0;
				double sizeMin = Double.MAX_VALUE;
				for (Map.Entry<Double, Long> entry : observedValue.entrySet()) {
					if (entry.getKey() > sizeMax) {
						sizeMax = entry.getKey();
					}
					if (entry.getKey() < sizeMin) {
						sizeMin = entry.getKey();
					}
					seriesObserved.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
				}

				for (double i = sizeMin; i <= sizeMax; i += (sizeMax - sizeMin) / 5000) {
					double sum = 0;
					double sumLog = 0;
					double sumN = 0;
					double sumNLog = 0;
					double sumNSquare = 0;

					sumLog += resultLog[0];
					sumLog += resultLog[1] * (double) Math.log(i);

					sumN += resultN[0];
					sumN += resultN[1] * (double) i;

					sumNLog += resultNLog[0];
					sumNLog += resultNLog[1] * (double) i * (double) Math.log(i);

					sumNSquare += resultNSquare[0];
					sumNSquare += resultNSquare[1] * (double) i * (double) i;

					sum += result[0];
					sum += result[1] * Math.log(i);
					sum += result[2] * i;
					sum += result[3] * (double) ((double) i * (double) Math.log(i));
					sum += result[4] * (double) ((double) i * (double) i);
					sum += result[5] * (double) ((double) i * (double) i * (double) Math.log(i));
					sum += result[6] * (double) ((double) i * (double) i * (double) i);

					seriesResult.getData().add(new XYChart.Data<>(i, sum));
					seriesLog.getData().add(new XYChart.Data<>(i, sumLog));
					seriesN.getData().add(new XYChart.Data<>(i, sumN));
					seriesNLog.getData().add(new XYChart.Data<>(i, sumNLog));
					seriesNSquare.getData().add(new XYChart.Data<>(i, sumNSquare));
				}

				Scene scene = new Scene(lineChart, 800, 600);

				lineChart.getData().addAll(seriesObserved, seriesResult, seriesLog, seriesN, seriesNLog, seriesNSquare);
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