package jus.stage.main;

import jus.stage.kernel.LinearRegression;
import jus.stage.utils.Settings;

public class Run {

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException(
					"You need to put at least one sample algorithm you wan to run as program argument");
		}

		try {
			for (int i = 0; i < args.length; i++) {
				double[] result = new double[Settings.precisionNeeded + 1];
				result = LinearRegression.run(args[i]);
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
