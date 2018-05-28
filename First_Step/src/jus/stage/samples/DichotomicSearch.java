package jus.stage.samples;

import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

public class DichotomicSearch {

	public static boolean isPresent(int[] tab, int element) {
		int left = 0;
		int right = tab.length - 1;
		boolean find = false;

		while (left <= right && !find) {
			int middle = (left + right) / 2;
			if (tab[middle] < element) {
				left = middle + 1;
			} else if (tab[middle] > element) {
				right = middle - 1;
			} else {
				find = true;
			}
		}

		return find;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nDicho.length; i++) {
				int size = Settings.nDicho[i];

				int[] tab = new int[size];
				for (int j = 0; j < size; j++) {
					tab[j] = j;
				}

				long durationTime = 0;

				long BeginTime = System.currentTimeMillis();
				isPresent(tab, (int) (Math.random() * size));
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
			samples = DichotomicSearch.getSamples(Settings.nbSample);
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
