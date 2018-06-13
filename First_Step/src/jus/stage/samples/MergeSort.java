package jus.stage.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

public class MergeSort {

	public static int[] mergeSort(int[] tab) {

		if (tab.length > 1) {
			int[] leftTab = Arrays.copyOfRange(tab, 0, tab.length / 2);
			int[] rightTab = Arrays.copyOfRange(tab, tab.length / 2, tab.length);
			leftTab = mergeSort(leftTab);
			rightTab = mergeSort(rightTab);
			return Merge(leftTab, rightTab);

		} else {
			return tab;
		}
	}

	private static int[] Merge(int[] leftTab, int[] rightTab) {
		int totalLength = leftTab.length + rightTab.length;
		int[] tab = new int[totalLength];
		int index1 = 0, index2 = 0;

		for (int i = 0; i < totalLength; i++) {
			if (index1 < leftTab.length && (index2 == rightTab.length || leftTab[index1] < rightTab[index2])) {
				tab[i] = leftTab[index1];
				index1++;
			} else {
				tab[i] = rightTab[index2];
				index2++;
			}
		}

		return tab;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nMerge.length; i++) {
				int size = Settings.nMerge[i];

				int[] tab = new int[size];
				for (int j = 0; j < size; j++) {
					tab[j] = tab.length - j;
				}

				long durationTime = 0;
				long BeginTime = System.currentTimeMillis();
				tab = mergeSort(tab);
				long EndTime = System.currentTimeMillis();
				durationTime += EndTime - BeginTime;

				samples.put(size, durationTime);

			}
			return samples;
		} else {
			throw new Exception("Sample number must be > 0");
		}
	}

	public static HashMap<double[], Long> getObservation() {
		HashMap<Integer, Long> samples;
		try {
			samples = MergeSort.getSamples(Settings.nbSample);
			return Features.makeFeatures(samples);
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
