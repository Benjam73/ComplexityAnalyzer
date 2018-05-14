package jus.aor.samples;

import java.util.HashMap;
import java.util.Map;

public class Features {

	public static final int nbSample = 4;

	// This mean we go up to n^3
	public static final int precisionNeeded = 6;

	public static HashMap<long[], Long> makeFeatures(HashMap<Integer, Long> samples) {

		HashMap<long[], Long> featuredMap = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
			long[] features = new long[precisionNeeded];
			int currentKey = entry.getKey();
			features[0] = currentKey;
			features[1] = (long) Math.log(currentKey);
			features[2] = (long) (currentKey * Math.log(currentKey));
			features[3] = (currentKey * currentKey);
			features[4] = (long) (currentKey * currentKey * Math.log(currentKey));
			features[5] = (long) ((long) currentKey * (long) currentKey * (long) currentKey);

			featuredMap.put(features, entry.getValue());
		}

		return featuredMap;
	}

	public static HashMap<float[], Long> scaling(HashMap<long[], Long> featuredMap) {

		long[][] tmp = new long[nbSample][precisionNeeded];
		float[][] scaled = new float[nbSample][precisionNeeded];
		int i = 0;
		for (Map.Entry<long[], Long> entry : featuredMap.entrySet()) {

			for (int j = 0; j < precisionNeeded; j++) {
				tmp[i][j] = entry.getKey()[j];
			}
			i++;
		}

		// Scaling each column to perform gradian algorithm

		for (i = 0; i < nbSample; i++) {
			long mean = 0;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			for (int j = 0; j < precisionNeeded; j++) {
				mean += tmp[i][j];
				if (tmp[i][j] > max) {
					max = tmp[i][j];
				}
				if (tmp[i][j] < min) {
					min = tmp[i][j];
				}
			}
			mean /= precisionNeeded;
			for (int k = 0; k < precisionNeeded; k++) {
				scaled[i][k] = (float) ((float) (tmp[i][k] - mean) / (float) (max - min));
			}
		}

		HashMap<float[], Long> ScaledFeaturedMap = new HashMap<>();

		for (Map.Entry<long[], Long> entry : featuredMap.entrySet()) {
			for (i = 0; i < nbSample; i++) {
				ScaledFeaturedMap.put(scaled[i], entry.getValue());
			}
		}

		return ScaledFeaturedMap;

	}

	public static void main(String[] args) {

		try {
			HashMap<Integer, Long> samples = MergeSort.getSamples(nbSample);

			HashMap<long[], Long> featuredSamples = makeFeatures(samples);

			for (Map.Entry<long[], Long> entry : featuredSamples.entrySet()) {
				System.out.println(entry.getKey()[0] + "\n");
				for (int i = 0; i < entry.getKey().length; i++) {
					System.out.println(i + " -> " + entry.getKey()[i]);
				}
				System.out.println("\n");

			}

			System.out.println("\n \n ----- AFTER SCALING ----- \n \n");

			HashMap<float[], Long> ScaledFeaturedSamples = scaling(featuredSamples);

			for (Map.Entry<float[], Long> entry : ScaledFeaturedSamples.entrySet()) {
				for (int i = 0; i < entry.getKey().length; i++) {
					System.out.println(i + " -> " + entry.getKey()[i]);
				}
				System.out.println("\n");

			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
