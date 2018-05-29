package jus.stage.samples;

import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

public class PowerPlantN {

	public static int maxProfitInNComplexity(int p[]) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < p.length; i++) {
			max_ending_here = max_ending_here + p[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}

		return max_so_far;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nPowerPlantN.length; i++) {
				int size = Settings.nPowerPlantN[i];
				int max = 0;
				int[] tab = new int[size];
				for (int j = 0; j < size; j++) {
					tab[j] = (int) (Math.random() * size);
				}

				long durationTime = 0;
				long BeginTime = System.currentTimeMillis();
				max = maxProfitInNComplexity(tab);
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
			samples = PowerPlantN.getSamples(Settings.nbSample);
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
