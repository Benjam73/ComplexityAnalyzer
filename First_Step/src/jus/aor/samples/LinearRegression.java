package jus.aor.samples;

import java.util.HashMap;

public class LinearRegression {

	/**
	 *
	 * These methods are used to get well known algorithm sample, in order to
	 * compute their complexity
	 */

	public static HashMap<float[], Long> getMergeSortSample() {
		HashMap<Integer, Long> samples;
		try {
			samples = MergeSort.getSamples(Features.nbSample);
			HashMap<long[], Long> featuredSamples = Features.makeFeatures(samples);
			return Features.scaling(featuredSamples);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return null;

	}

	public static HashMap<float[], Long> getBubbleSortSample() {
		HashMap<Integer, Long> samples;
		try {
			samples = BubbleSort.getSamples(Features.nbSample);
			HashMap<long[], Long> featuredSamples = Features.makeFeatures(samples);
			return Features.scaling(featuredSamples);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return null;

	}

	public static HashMap<float[], Long> getDichotomicSearchSample() {
		HashMap<Integer, Long> samples;
		try {
			samples = DichoromicSearch.getSamples(Features.nbSample);
			HashMap<long[], Long> featuredSamples = Features.makeFeatures(samples);
			return Features.scaling(featuredSamples);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return null;

	}

}
