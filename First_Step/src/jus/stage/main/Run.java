package jus.stage.main;

import jus.stage.kernel.LinearRegression;

public class Run {

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException(
					"You need to put at least one sample algorithm you wan to run as program argument");
		}

		try {
			for (int i = 0; i < args.length; i++) {
				LinearRegression.run(args[i]);
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
