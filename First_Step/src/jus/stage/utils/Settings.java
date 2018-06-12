package jus.stage.utils;

public class Settings {

	public static int[] nBubble = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };

	public static int[] nMerge = { 1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 9000000,
			10000000 };

	public static int[] nDicho = { 1000000, 2500000, 5000000, 7500000, 10000000, 15000000, 20000000, 50000000, 75000000,
			100000000, 150000000 };

	public static int[] nPowerPlantN = { 1000000, 2500000, 5000000, 7500000, 10000000, 15000000, 20000000, 50000000,
			75000000, 100000000, 150000000 };

	public static int[] nPowerPlantNSquare = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };

	public static int[] nMatrixProduct = { 10, 50, 75, 100, 125, 150, 200, 250, 350, 450, 500 };

	public static int nbSample = nBubble.length;

	// This mean we go up to n^3
	public static int precisionNeeded = 6;

	public static double xmin = 0;

	public static double xmax = Double.MAX_VALUE;

	public static double ymin = 0;

	public static double ymax = Double.MAX_VALUE;

}
