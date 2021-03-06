package jus.stage.kernel;

import java.util.HashMap;
import java.util.Map;

import jus.stage.samples.BubbleSort;
import jus.stage.utils.Settings;

/**
 * The Features class is used to create all the features and the scaling.
 * 
 * @author Benjamin Besnier
 * @version 1.0
 * 
 */

public class Features {

	/**
	 * This method is used to create all the features needed, using the CPU time
	 * obtained
	 * 
	 * @param samples
	 *            The result of samples run before
	 * @return The array with all the features created
	 */
	public static HashMap<double[], Long> makeFeatures(HashMap<Integer, Long> samples) {

		HashMap<double[], Long> featuredMap = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
			double[] features = new double[Settings.precisionNeeded];
			int currentKey = entry.getKey();

			// The features are the following :
			// log(n)
			// n
			// nlog(n)
			// n^2
			// n^2log(n)
			// n^3

			features[0] = (double) Math.log(currentKey);
			features[1] = currentKey;
			for (int i = 2; i < Settings.precisionNeeded; i++) {
				features[i] = (double) ((double) features[i - 2] * (double) currentKey);
			}

			featuredMap.put(features, entry.getValue());
		}

		return featuredMap;
	}

	public static HashMap<Double, Long> getWantedFeature(HashMap<double[], Long> featuresMap, int featureWanted) {
		HashMap<Double, Long> result = new HashMap<>();
		for (Map.Entry<double[], Long> entry : featuresMap.entrySet()) {
			result.put(entry.getKey()[featureWanted], entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {

		try {
			HashMap<Integer, Long> samples = BubbleSort.getSamples(Settings.nbSample);

			HashMap<double[], Long> featuredSamples = makeFeatures(samples);

			for (Map.Entry<double[], Long> entry : featuredSamples.entrySet()) {
				System.out.println(
						"For an array of " + entry.getKey()[1] + " elements, it takes : " + entry.getValue() + " ms.");
				System.out.println("\n");
				for (int i = 0; i < entry.getKey().length; i++) {
					System.out.println(i + " -> " + entry.getKey()[i] + " Value : " + entry.getValue());
				}
				System.out.println("\n");
			}

			System.out.println("get features");
			HashMap<Double, Long> result = getWantedFeature(featuredSamples, 0);

			for (Map.Entry<Double, Long> entry : result.entrySet()) {
				System.out.println(entry.getKey() + " ; " + entry.getValue());
			}
		} catch (

		Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
