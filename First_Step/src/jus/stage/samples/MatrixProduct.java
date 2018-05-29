package jus.stage.samples;

import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

/* Should be in O(n^3) */

public class MatrixProduct {

	public static int[][] Product(int[][] A, int[][] B) {

		int aRows = A.length;
		int aColumns = A[0].length;
		int bRows = B.length;
		int bColumns = B[0].length;

		if (aColumns != bRows) {
			throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
		}

		int[][] result = new int[aRows][bColumns];

		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		return result;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nMatrixProduct.length; i++) {
				int size = Settings.nMatrixProduct[i];
				int max = 0;

				int[][] A = new int[size][size];
				int[][] B = new int[size][size];

				int[][] result = new int[size][size];

				for (int j = 0; j < size; j++) {
					for (int k = 0; k < size; k++) {
						A[j][k] = (int) (Math.random() * size);
						B[j][k] = (int) (Math.random() * size);
					}
				}

				long durationTime = 0;
				long BeginTime = System.currentTimeMillis();
				result = Product(A, B);
				long EndTime = System.currentTimeMillis();
				durationTime += EndTime - BeginTime;

				samples.put(size, durationTime);

			}
			return samples;
		} else {
			throw new Exception("Sample number must be > 0");
		}
	}

	public static HashMap<Long, HashMap<double[], Long>> getObservation() {
		HashMap<Integer, Long> samples;
		try {
			samples = MatrixProduct.getSamples(Settings.nbSample);
			HashMap<double[], Long> featuredSamples = Features.makeFeatures(samples);
			return Features.scaling(featuredSamples);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			HashMap<Integer, Long> samples = getSamples(Settings.nbSample);

			for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
				System.out.println("For an array of " + entry.getKey() + " elements , it takes" + " : "
						+ entry.getValue() + " ms.");
			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
