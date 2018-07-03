package jus.stage.utils;

public class Settings {

	// public static int[] nBubble = { 10000, 20000, 30000, 40000, 50000, 60000,
	// 70000, 80000, 90000, 100000 };

	public static int[] nBubble = { 2500, 5000, 10000, 15000, 20000, 25000, 30000, 35000, 40000 };

	public static int[] nMerge = { 1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 9000000 };

	public static int[] nDicho = { 1000000, 2500000, 5000000, 7500000, 10000000, 15000000, 20000000, 50000000, 75000000,
			100000000 };

	// public static int[] nPowerPlantN = { 20000000, 30000000, 40000000,
	// 50000000, 60000000, 70000000, 80000000, 90000000,
	// 100000000 };

	public static int[] nPowerPlantN = { 10000000, 15000000, 20000000, 25000000, 30000000, 35000000, 40000000, 45000000,
			50000000 };

	public static int[] nPowerPlantNSquare = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };

	public static int[] nMatrixProduct = { 300, 350, 400, 450, 500, 550, 600, 650, 700 };

	// public static int[] nMatrixProduct = { 300, 400, 500, 600, 700, 800, 900,
	// 1000, 1100 };
	public static int nbSample = nBubble.length;

	public static int k1 = 1000;

	public static int k2 = 1000;

	// This mean we go up to n^3
	public static int precisionNeeded = 6;

	public static double xmin = 0;

	public static double xmax = Double.MAX_VALUE;

	public static double ymin = 0;

	public static double ymax = Double.MAX_VALUE;

	public static boolean sizeExisting(int[] sizeSample, double targetSize) {
		boolean exist = false;
		for (int i = 0; i < sizeSample.length && !exist; i++) {
			if (sizeSample[i] == targetSize) {
				exist = true;
			}
		}
		return exist;
	}

}
