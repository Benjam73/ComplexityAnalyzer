package jus.aor.samples;

import java.util.HashMap;
import java.util.Map;

public class Features {

	public static HashMap<long[], Long> makeFeatures(HashMap<Integer, Long> samples) {

		HashMap<long[], Long> featuredMap = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : samples.entrySet()) {
			long[] features = new long[6];
			int currentKey = entry.getKey();
			features[0] = currentKey;
			features[1] = (long) Math.log(currentKey);
			features[2] = (long) (currentKey * Math.log(currentKey));
			features[3] = (currentKey * currentKey);
			features[4] = (long) (currentKey * currentKey * Math.log(currentKey));
			features[5] = (long) ((long) currentKey * (long) currentKey * (long) currentKey);

			featuredMap.put(features, entry.getValue());
		}

		return featuredMap;
	}

	public static void main(String[] args) {

		try {
			HashMap<Integer, Long> samples = MergeSort.getSamples(5);
			HashMap<long[], Long> featuredSamples = makeFeatures(samples);

			for (Map.Entry<long[], Long> entry : featuredSamples.entrySet()) {
				System.out.println(entry.getKey()[0] + "\n");
				for (int i = 0; i < entry.getKey().length; i++) {
					System.out.println(i + " -> " + entry.getKey()[i]);
				}
				System.out.println("\n");

			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
