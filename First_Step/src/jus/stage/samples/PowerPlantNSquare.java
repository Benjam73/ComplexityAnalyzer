package jus.stage.samples;

import java.util.HashMap;
import java.util.Map;

import jus.stage.kernel.Features;
import jus.stage.utils.Settings;

public class PowerPlantNSquare {

	public static int maxProfitInNSquare(int p[]) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < p.length; i++) {
			int sum = 0;
			for (int j = i; j < p.length; j++) {
				sum += p[j];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	public static HashMap<Integer, Long> getSamples(int sampleNumber) throws Exception {
		HashMap<Integer, Long> samples = new HashMap<>();
		if (sampleNumber > 0) {
			for (int i = 0; i < Settings.nPowerPlantNSquare.length; i++) {
				int size = Settings.nPowerPlantNSquare[i];
				int max = 0;
				int[] tab = new int[size];
				for (int j = 0; j < size; j++) {
					tab[j] = (int) (Math.random() * size);
				}

				long durationTime = 0;
				long BeginTime = System.currentTimeMillis();
				max = maxProfitInNSquare(tab);
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
			samples = PowerPlantNSquare.getSamples(Settings.nbSample);
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
