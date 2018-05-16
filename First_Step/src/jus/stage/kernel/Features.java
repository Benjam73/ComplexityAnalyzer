package jus.stage.kernel;

import java.util.HashMap;
import java.util.Map;

import jus.stage.samples.MergeSort;
import jus.stage.utils.Parameters;

public class Features {

	public static HashMap<long[], Long> makeFeatures(HashMap<Integer, Long> samples) {

		HashMap<long[], Long> featuredMap = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
			long[] features = new long[Parameters.precisionNeeded];
			int currentKey = entry.getKey();

			features[0] = (long) Math.log(currentKey);
			features[1] = currentKey;
			for (int i = 2; i < Parameters.precisionNeeded; i++) {
				features[i] = (long) ((long) features[i - 2] * (long) currentKey);
			}

			featuredMap.put(features, entry.getValue());
		}

		return featuredMap;
	}

	public static HashMap<Long, HashMap<float[], Long>> scaling(HashMap<long[], Long> featuredMap) {

		long[][] tmp = new long[Parameters.nbSample][Parameters.precisionNeeded];
		float[][] scaled = new float[Parameters.nbSample][Parameters.precisionNeeded];
		int i = 0;
		for (Map.Entry<long[], Long> entry : featuredMap.entrySet()) {

			for (int j = 0; j < Parameters.precisionNeeded; j++) {
				tmp[i][j] = entry.getKey()[j];
			}
			i++;
		}

		// Scaling each column to perform gradian algorithm

		for (i = 0; i < Parameters.nbSample; i++) {
			long mean = 0;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			for (int j = 0; j < Parameters.precisionNeeded; j++) {
				mean += tmp[i][j];
				if (tmp[i][j] > max) {
					max = tmp[i][j];
				}
				if (tmp[i][j] < min) {
					min = tmp[i][j];
				}
			}
			mean /= Parameters.precisionNeeded;
			for (int k = 0; k < Parameters.precisionNeeded; k++) {
				scaled[i][k] = (float) ((float) (tmp[i][k] - mean) / (float) (max - min));
				// scaled[i][k] = tmp[i][k];
			}
		}

		HashMap<float[], Long> ScaledFeaturedMapTmp = new HashMap<>();

		HashMap<Long, HashMap<float[], Long>> ScaledFeaturedMap = new HashMap<>();

		i = 0;
		for (Map.Entry<long[], Long> entry : featuredMap.entrySet()) {

			ScaledFeaturedMapTmp.put(scaled[i], entry.getValue());
			ScaledFeaturedMap.put(new Long(entry.getKey()[1]), ScaledFeaturedMapTmp);

			i++;

			ScaledFeaturedMapTmp = new HashMap<>();
		}

		return ScaledFeaturedMap;

	}

	public static void main(String[] args) {

		try {
			HashMap<Integer, Long> samples = MergeSort.getSamples(Parameters.nbSample);

			HashMap<long[], Long> featuredSamples = makeFeatures(samples);

			for (Map.Entry<long[], Long> entry : featuredSamples.entrySet()) {
				System.out.println(entry.getKey()[1] + "\n");
				for (int i = 0; i < entry.getKey().length; i++) {
					System.out.println(i + " -> " + entry.getKey()[i] + " Value : " + entry.getValue());
				}
				System.out.println("\n");

			}

			System.out.println("\n \n ----- AFTER SCALING ----- \n \n");

			HashMap<Long, HashMap<float[], Long>> ScaledFeaturedSamples = scaling(featuredSamples);

			for (Map.Entry<Long, HashMap<float[], Long>> entry1 : ScaledFeaturedSamples.entrySet()) {

				for (Map.Entry<float[], Long> entry : entry1.getValue().entrySet()) {
					System.out.println(entry1.getKey() + "\n");
					for (int i = 0; i < entry.getKey().length; i++) {
						System.out.println(i + " -> " + entry.getKey()[i] + " Value : " + entry.getValue());
					}

				}
				System.out.println("\n");
			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
