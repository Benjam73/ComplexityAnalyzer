package jus.aor.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DichoromicSearch {

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

		if (sampleNumber > 0) {
			int nbIteration = 10;
			int size = 1000;

			HashMap<Integer, Long> samples = new HashMap<>();

			int[] tab = new int[size];
			for (int i = 0; i < size; i++) {
				tab[i] = i;
			}

			for (int i = 0; i < sampleNumber; i++) {
				long durationTime = 0;
				for (int k = 0; k < nbIteration; k++) {
					int[] tmp = Arrays.copyOf(tab, tab.length);
					long BeginTime = System.currentTimeMillis();
					isPresent(tmp, (int) (Math.random() * size));
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
