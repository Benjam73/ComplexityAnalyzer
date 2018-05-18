package jus.stage.kernel;

import java.util.HashMap;
import java.util.Map;

import jus.stage.samples.MergeSort;
import jus.stage.utils.Settings;

public class Features {

	public static HashMap<double[], Long> makeFeatures(HashMap<Integer, Long> samples) {

		HashMap<double[], Long> featuredMap = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
			double[] features = new double[Settings.precisionNeeded];
			int currentKey = entry.getKey();

			features[0] = (double) Math.log10(currentKey);
			features[1] = currentKey;
			for (int i = 2; i < Settings.precisionNeeded; i++) {
				features[i] = (double) ((double) features[i - 2] * (double) currentKey);
			}

			featuredMap.put(features, entry.getValue());
		}

		return featuredMap;
	}

	public static HashMap<Long, HashMap<double[], Long>> scaling(HashMap<double[], Long> featuredMap) {

		double[][] tmp = new double[Settings.nbSample][Settings.precisionNeeded];
		double[][] scaled = new double[Settings.nbSample][Settings.precisionNeeded];
		int i = 0;
		for (Map.Entry<double[], Long> entry : featuredMap.entrySet()) {

			for (int j = 0; j < Settings.precisionNeeded; j++) {
				tmp[i][j] = entry.getKey()[j];
			}
			i++;
		}

		// Scaling each column to perform gradian algorithm

		for (i = 0; i < Settings.nbSample; i++) {
			double mean = 0;
			double max = Long.MIN_VALUE;
			double min = Long.MAX_VALUE;
			for (int j = 0; j < Settings.precisionNeeded; j++) {
				mean += tmp[i][j];
				if (tmp[i][j] > max) {
					max = tmp[i][j];
				}
				if (tmp[i][j] < min) {
					min = tmp[i][j];
				}
			}
			mean /= Settings.precisionNeeded;
			for (int k = 0; k < Settings.precisionNeeded; k++) {
				scaled[i][k] = (double) (((tmp[i][k] - mean)) / (float) (max - min));
				// scaled[i][k] = (double) ((tmp[i][k] - mean));
				// scaled[i][k] = tmp[i][k];
			}
		}

		HashMap<double[], Long> ScaledFeaturedMapTmp = new HashMap<>();

		HashMap<Long, HashMap<double[], Long>> ScaledFeaturedMap = new HashMap<>();

		i = 0;
		for (Map.Entry<double[], Long> entry : featuredMap.entrySet()) {

			ScaledFeaturedMapTmp.put(scaled[i], entry.getValue());
			ScaledFeaturedMap.put(new Long((long) entry.getKey()[1]), ScaledFeaturedMapTmp);

			i++;

			ScaledFeaturedMapTmp = new HashMap<>();
		}

		return ScaledFeaturedMap;

	}

	public static void main(String[] args) {

		try {
			HashMap<Integer, Long> samples = MergeSort.getSamples(Settings.nbSample);

			HashMap<double[], Long> featuredSamples = makeFeatures(samples);

			for (Map.Entry<double[], Long> entry : featuredSamples.entrySet()) {
				System.out.println(entry.getKey()[1] + " iterations takes : " + entry.getValue() + " ms.");
			}

			System.out.println("\n \n ----- AFTER SCALING ----- \n \n");

			HashMap<Long, HashMap<double[], Long>> ScaledFeaturedSamples = scaling(featuredSamples);

			for (Map.Entry<Long, HashMap<double[], Long>> entry1 : ScaledFeaturedSamples.entrySet()) {

				for (Map.Entry<double[], Long> entry : entry1.getValue().entrySet()) {
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
