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
import jus.stage.kernel.LinearRegressionNCubic;
import jus.stage.kernel.LinearRegressionNLog;
import jus.stage.kernel.LinearRegressionNSquare;
import jus.stage.kernel.LinearRegressionNSquareLog;
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
	int rightResult = 0;

	/**
	 * Mostly based on :
	 * https://docs.oracle.com/javafx/2/charts/line-chart.htm#CIHGBCFI
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void start(Stage stage) {

		for (String param : getParameters().getRaw()) {
			for (int tmp = 0; tmp < 1; tmp++) {
				System.out.println("tmp ; " + tmp);
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
				XYChart.Series seriesNSquareLog = new XYChart.Series();
				XYChart.Series seriesNCubic = new XYChart.Series();

				seriesObserved.setName("Values obtained");
				seriesResult.setName("Linear regression");
				seriesLog.setName("Linear regression Log");
				seriesN.setName("Linear regression N");
				seriesNLog.setName("Linear regression NLog");
				seriesNSquare.setName("Linear regression N^2");
				seriesNSquareLog.setName("Linear regression N^2Log");
				seriesNCubic.setName("Linear regression N^3");

				// populating the series with data

				double[] result = new double[Settings.precisionNeeded + 1];
				HashMap<Double, Long> observedValue = new HashMap<>();
				HashMap<double[], Long> featuresMap = new HashMap<>();
				double[] resultLog = new double[2];
				double[] resultN = new double[2];
				double[] resultNLog = new double[2];
				double[] resultNSquare = new double[2];
				double[] resultNSquareLog = new double[2];
				double[] resultNCubic = new double[2];

				int[] sizeSample = new int[Settings.nbSample];

				try {

					// Choosing the sample to run
					Class<?> algorithm = Class.forName("jus.stage.samples." + param);
					if (algorithm == MergeSort.class) {
						System.out.println("---------- Merge Sort ----------");
						featuresMap = MergeSort.getObservation();
						sizeSample = Settings.nMerge;
					}
					if (algorithm == BubbleSort.class) {
						System.out.println("---------- Bubble Sort ----------");
						featuresMap = BubbleSort.getObservation();
						sizeSample = Settings.nBubble;
					}
					if (algorithm == DichotomicSearch.class) {
						System.out.println("---------- DichotomicSearch ----------");
						featuresMap = DichotomicSearch.getObservation();
						sizeSample = Settings.nDicho;
					}
					if (algorithm == PowerPlantN.class) {
						System.out.println("---------- Power Plant N ----------");
						featuresMap = PowerPlantN.getObservation();
						sizeSample = Settings.nPowerPlantN;
					}
					if (algorithm == PowerPlantNSquare.class) {
						System.out.println("---------- Power Plant N Square ----------");
						featuresMap = PowerPlantNSquare.getObservation();
						sizeSample = Settings.nPowerPlantNSquare;
					}
					if (algorithm == MatrixProduct.class) {
						System.out.println("---------- Matrix Product ----------");
						featuresMap = MatrixProduct.getObservation();
						sizeSample = Settings.nMatrixProduct;
					}

					observedValue = Features.getWantedFeature(featuresMap, 1);
					result = LinearRegression.run(featuresMap);
					resultLog = LinearRegressionLog.doLinearRegression(featuresMap);
					resultN = LinearRegressionN.doLinearRegression(featuresMap);
					resultNLog = LinearRegressionNLog.doLinearRegression(featuresMap);
					resultNSquare = LinearRegressionNSquare.doLinearRegression(featuresMap);
					resultNSquareLog = LinearRegressionNSquareLog.doLinearRegression(featuresMap);
					resultNCubic = LinearRegressionNCubic.doLinearRegression(featuresMap);

					double sizeMax = 0;
					double sizeMin = Double.MAX_VALUE;
					double totalTime = 0;

					for (Map.Entry<Double, Long> entry : observedValue.entrySet()) {
						if (entry.getKey() > sizeMax) {
							sizeMax = entry.getKey();
						}
						if (entry.getKey() < sizeMin) {
							sizeMin = entry.getKey();
						}
						seriesObserved.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
						totalTime += entry.getValue();
					}

					double residualSquareSumLog = 0;
					double residualSquareSumN = 0;
					double residualSquareSumNLog = 0;
					double residualSquareSumNSquare = 0;
					double residualSquareSumNSquareLog = 0;
					double residualSquareSumNCubic = 0;
					double residualSquareSumResult = 0;
					for (double i = sizeMin; i <= sizeMax; i += (sizeMax - sizeMin) / 100 + 10) {
						double sum = 0;
						double sumLog = 0;
						double sumN = 0;
						double sumNLog = 0;
						double sumNSquare = 0;
						double sumNSquareLog = 0;
						double sumNCubic = 0;

						sumLog += resultLog[0];
						sumLog += resultLog[1] * (double) Math.log(i);

						sumN += resultN[0];
						sumN += resultN[1] * (double) i;

						sumNLog += resultNLog[0];
						sumNLog += resultNLog[1] * (double) i * (double) Math.log(i);

						sumNSquare += resultNSquare[0];
						sumNSquare += resultNSquare[1] * (double) i * (double) i;

						sumNSquareLog += resultNSquareLog[0];
						sumNSquareLog += resultNSquareLog[1] * ((double) i * (double) i * Math.log(i));

						sumNCubic += resultNCubic[0];
						sumNCubic += resultNCubic[1] * ((double) i * (double) i * (double) i);

						sum += result[0];
						sum += result[1] * Math.log(i);
						sum += result[2] * i;
						sum += result[3] * (double) ((double) i * (double) Math.log(i));
						sum += result[4] * (double) ((double) i * (double) i);
						sum += result[5] * (double) ((double) i * (double) i * (double) Math.log(i));
						sum += result[6] * (double) ((double) i * (double) i * (double) i);

						if (Settings.sizeExisting(sizeSample, i)) {
							double target = getValueFromKey(observedValue, i);
							residualSquareSumResult = Math.pow((target - sum), 2);
							residualSquareSumLog += Math.pow((target - sumLog), 2);
							residualSquareSumN += Math.pow((target - sumN), 2);
							residualSquareSumNLog += Math.pow((target - sumNLog), 2);
							residualSquareSumNSquare += Math.pow((target - sumNSquare), 2);
							residualSquareSumNSquareLog += Math.pow((target - sumNSquareLog), 2);
							residualSquareSumNCubic += Math.pow((target - sumNCubic), 2);
						}

						seriesResult.getData().add(new XYChart.Data<>(i, sum));
						seriesLog.getData().add(new XYChart.Data<>(i, sumLog));
						seriesN.getData().add(new XYChart.Data<>(i, sumN));
						seriesNLog.getData().add(new XYChart.Data<>(i, sumNLog));
						seriesNSquare.getData().add(new XYChart.Data<>(i, sumNSquare));
						seriesNSquareLog.getData().add(new XYChart.Data<>(i, sumNSquareLog));
						seriesNCubic.getData().add(new XYChart.Data<>(i, sumNCubic));

					}

					System.out.println("Error for linear regression : " + residualSquareSumResult);
					System.out.println("Error for O(log(n)) : " + residualSquareSumLog);
					System.out.println("Error for O(n) : " + residualSquareSumN);
					// System.out.println("Error for O(nLog(n)) : " +
					// residualSquareSumNLog);
					System.out.println("Error for O(n^2) : " + residualSquareSumNSquare);
					// System.out.println("Error for O(n^2Log(n)) : " +
					// residualSquareSumNSquareLog);
					System.out.println("Error for O(n^3) : " + residualSquareSumNCubic);

					Scene scene = new Scene(lineChart, 800, 600);

					// lineChart.getData().addAll(seriesObserved, seriesResult,
					// seriesLog, seriesN, seriesNSquare,
					// seriesNCubic);
					// lineChart.getData().addAll(seriesObserved, seriesResult);
					//
					// stage.setScene(scene);
					// stage.show();

					rightResult += determineComplexity(residualSquareSumLog, residualSquareSumN, residualSquareSumNLog,
							residualSquareSumNSquare, residualSquareSumNSquareLog, residualSquareSumNCubic);

					System.out.println("The process takes " + totalTime / 1000 + " s.");

				} catch (Exception e) {
					e.getMessage();
					e.printStackTrace();
				}

				System.out.println("\n");
			}
			System.out.println("rate : " + rightResult);
		}

	}

	private long getValueFromKey(HashMap<Double, Long> resultMap, double key) {
		for (Map.Entry<Double, Long> entry : resultMap.entrySet()) {
			if (entry.getKey() == key) {
				return entry.getValue();
			}
		}
		return (Long) null;
	}

	private int determineComplexity(double residualSquareSumLog, double residualSquareSumN,
			double residualSquareSumNLog, double residualSquareSumNSquare, double residualSquareSumNSquareLog,
			double residualSquareSumNCubic) {
		double min = Math.min(residualSquareSumLog,
				Math.min(residualSquareSumN, Math.min(residualSquareSumNSquare, residualSquareSumNCubic)));
		if (min == residualSquareSumLog) {
			System.out.println("Average complexity of this algorithm is O(log(n))");
		} else if (min == residualSquareSumN) {
			System.out.println("Average complexity of this algorithm is O(n)");

		} else if (min == residualSquareSumNSquare) {
			System.out.println("Average complexity of this algorithm is O(n^2)");

		} else if (min == residualSquareSumNCubic) {
			System.out.println("Average complexity of this algorithm is O(n^3)");
			return 1;
		}
		return 0;
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