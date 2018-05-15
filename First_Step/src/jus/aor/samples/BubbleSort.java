package jus.aor.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jus.aor.kernel.Features;

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

	private static void exchange(int[] tab, int j, int i) {
		int tmp;
		tmp = tab[j];
		tab[j] = tab[i];
		tab[i] = tmp;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {

		if (sampleNumber > 0) {
			int nbIteration = 10;
			int size = 1000;

			HashMap<Integer, Long> samples = new HashMap<>();

			int[] tab = new int[size];
			for (int i = 0; i < size; i++) {
				tab[i] = (int) (Math.random() * 2500);
			}

			for (int i = 0; i < sampleNumber; i++) {
				long durationTime = 0;
				for (int k = 0; k < nbIteration; k++) {
					int[] tmp = Arrays.copyOf(tab, tab.length);
					long BeginTime = System.currentTimeMillis();
					tmp = bubbleSort(tmp);
					long EndTime = System.currentTimeMillis();
					durationTime += EndTime - BeginTime;

				}
				samples.put(nbIteration, durationTime);
				nbIteration *= 10;
			}
			return samples;
		} else {
			throw new Exception("Sample number must be > 0");
		}
	}

	public static void main(String[] args) {
		try {
			HashMap<Integer, Long> samples = getSamples(Features.nbSample);

			for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
				System.out.println(
						"For " + entry.getKey() + " Iterations, the duration is " + " : " + entry.getValue() + " ms.");
			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
