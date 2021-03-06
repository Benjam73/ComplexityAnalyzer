package jus.stage.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

public class BubbleSort {

	public static int[] bubbleSort(int[] T) {
		int i, j;
		for (i = T.length; i != 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (T[j + 1] < T[j]) {
					exchange(T, j, j + 1);
				}

			}
		}

		return T;
	}

	public static int[] bubbleSortBis(int[] T) {
		int i, j;
		int tmp = 0;
		for (int k = 0; k < Settings.k1; k++) {
			for (i = 0; i < T.length; i++) {
				tmp++;

			}
		}

		for (int kbis = 0; kbis < Settings.k2; kbis++) {
			int[] copy = Arrays.copyOf(T, T.length);
			copy = MergeSort.mergeSort(copy);
		}
		for (i = T.length; i != 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (T[j + 1] < T[j]) {
					exchange(T, j, j + 1);
				}

			}
		}

		return T;
	}

	private static void exchange(int[] tab, int j, int i) {
		int tmp;
		tmp = tab[j];
		tab[j] = tab[i];
		tab[i] = tmp;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nBubble.length; i++) {
				int size = Settings.nBubble[i];

				int[] tab = new int[size];
				for (int j = 0; j < size; j++) {
					tab[j] = tab.length - j;
				}

				long durationTime = 0;

				long BeginTime = System.currentTimeMillis();
				tab = bubbleSortBis(tab);
				long EndTime = System.currentTimeMillis();
				durationTime += EndTime - BeginTime;
				samples.put(size, durationTime);
			}
			return samples;
		}

		else

		{
			throw new Exception("Sample number must be > 0");
		}
	}

	public static HashMap<double[], Long> getObservation() {
		HashMap<Integer, Long> samples;
		try {
			samples = BubbleSort.getSamples(Settings.nbSample);
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
			double time = 0;
			for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
				System.out.println("For an array of " + entry.getKey() + " elements , it takes" + " : "
						+ entry.getValue() + " ms.");
				time += entry.getValue();
			}
			System.out.println("tme : " + time / 1000 + " s.");
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
