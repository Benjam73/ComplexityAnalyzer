package jus.stage.utils;

public class Settings {

	public static int[] nBubble = { 789, 1000, 2547, 3657, 5874, 7515, 9100, 10000, 12054, 14875, 16000 };

	public static int[] nMerge = { 14875, 16000, 25000, 45000, 75000, 100000, 250000, 500000, 750000, 1000000,
			1500000 };

	public static int[] nDicho = { 75000, 100000, 250000, 500000, 750000, 1000000, 1500000, 2000000, 5000000, 7500000,
			250000000 };

	public static int nbSample = nBubble.length;

	// This mean we go up to n^3
	public static int precisionNeeded = 6;

	public static double xmin = 0;

	public static double xmax = Double.MAX_VALUE;

	public static double ymin = 0;

	public static double ymax = Double.MAX_VALUE;

}
