package jus.stage.kernel;

import java.util.HashMap;
import java.util.Map;

import Jama.Matrix;
import jus.stage.samples.BubbleSort;
import jus.stage.utils.Settings;

public class LinearRegression {

	public static double[][] makeXMatrix(HashMap<double[], Long> featuresMap) {

		double[][] result = new double[Settings.nbSample][Settings.precisionNeeded];

		int k = 0;

		for (Map.Entry<double[], Long> entry : featuresMap.entrySet()) {

			for (int i = 0; i < entry.getKey().length; i++) {
				result[k][i] = entry.getKey()[i];
			}
			k++;

		}

		return result;
	}

	public static double[] makeYMatrix(HashMap<double[], Long> featuresMap) {

		double[] result = new double[Settings.nbSample];

		int k = 0;

		for (Map.Entry<double[], Long> entry : featuresMap.entrySet()) {

			result[k] = entry.getValue();
			k++;
		}

		return result;
	}

	public static double[] getKey(HashMap<Long, HashMap<float[], Long>> featuredScaledMap) {
		double[] key = new double[Settings.nbSample];
		int i = 0;
		for (Map.Entry<Long, HashMap<float[], Long>> entry1 : featuredScaledMap.entrySet()) {
			key[i] = entry1.getKey();
			i++;
		}
		return key;
	}

	public static double[][] transposeMatrix(double[][] X) {
		double[][] transpose = new double[X[0].length][X.length];
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				transpose[j][i] = X[i][j];

			}
		}
		return transpose;
	}

	public static double[][] matrixProduct(double[][] X, double[][] Y) throws Exception {

		if (X[0].length != Y.length) {
			throw new Exception("X Colums and Y Raws must be the same");
		}
		double[][] result = new double[X.length][Y[0].length];

		for (int i = 0; i < X.length; i++) { // XRow
			for (int j = 0; j < Y[0].length; j++) { // YColumn
				for (int k = 0; k < X[0].length; k++) { // XColumn
					result[i][j] += X[i][k] * Y[k][j];
				}
			}
		}

		return result;

	}

	public static double[] matrixProduct(double[][] X, double[] Y) throws Exception {

		if (X[0].length != Y.length) {
			throw new Exception("X Colums and Y Raws must be the same");
		}

		double[] result = new double[Y.length];

		for (int i = 0; i < X.length; i++) { // XRaw
			for (int j = 0; j < Y.length; j++) {
				result[i] += X[i][j] * Y[j];
			}

		}

		return result;
	}

	public static Matrix matrixInversion(Matrix X) {
		return X.inverse();

	}

	public static Matrix matrixProduct(Matrix X, Matrix Y) {
		return X.times(Y);
	}

	public static Matrix transposeMatrix(Matrix X) {
		return X.transpose();
	}

	public static Matrix matrixFrom2DArray(double[][] array) {
		return new Matrix(array);
	}

	public static Matrix matrixFrom1DArray(double[] array) {
		return new Matrix(array, array.length);
	}

	public static Matrix finalProduct(Matrix X, Matrix Y) {

		Matrix Xtranspose = transposeMatrix(X);
		Matrix XXtranspose = matrixProduct(Xtranspose, X);
		Matrix XtransposeY = matrixProduct(Xtranspose, Y);
		Matrix inverseXXtranspose = matrixInversion(XXtranspose);
		Matrix result = matrixProduct(inverseXXtranspose, XtransposeY);
		return result;

	}

	/**
	 * From JamaUtils
	 * (https://github.com/ppolabs/jlinda/blob/master/jlinda-core/src/main/java/org/jlinda/core/coregistration/estimation/utils/JamaUtils.java)
	 * Appends additional columns to the first matrix.
	 *
	 * @param m
	 *            the first matrix.
	 * @param n
	 *            the matrix to append containing additional columns.
	 * @return a matrix with all the columns of m then all the columns of n.
	 */
	public static Matrix columnAppend(Matrix m, Matrix n) {
		int mNumRows = m.getRowDimension();
		int mNumCols = m.getColumnDimension();
		int nNumRows = n.getRowDimension();
		int nNumCols = n.getColumnDimension();

		if (mNumRows != nNumRows)
			throw new IllegalArgumentException("Number of rows must be identical to column-append.");

		Matrix x = new Matrix(mNumRows, mNumCols + nNumCols);
		x.setMatrix(0, mNumRows - 1, 0, mNumCols - 1, m);
		x.setMatrix(0, mNumRows - 1, mNumCols, mNumCols + nNumCols - 1, n);

		return x;
	}

	public static double[] run(HashMap<double[], Long> featuresMap) throws Exception {

		Matrix X = matrixFrom2DArray(makeXMatrix(featuresMap));
		Matrix Y = matrixFrom1DArray(makeYMatrix(featuresMap));

		// double[][] Xbis = makeXMatrix(featuredScaledMap);

		Matrix var = new Matrix(X.getRowDimension(), 1, 1.0);

		X = columnAppend(var, X);

		// double[] Key = getKey(featuredScaledMap);

		Matrix result = finalProduct(X, Y);

		double[] resultArray = result.getRowPackedCopy();
		String output = "";

		System.out.println("The linear regression gives : ");
		output += "H(n) =" + resultArray[0] + " + ";
		for (int i = 1; i < resultArray.length - 1; i++) {
			output += resultArray[i] + getComplexity(i) + ") + ";
		}
		output += resultArray[resultArray.length - 1] + getComplexity(resultArray.length - 1) + ")";

		System.out.println(output);

		return resultArray;

	}

	public static void main(String[] args) throws Exception {
		HashMap<double[], Long> featuredScaledMap = BubbleSort.getObservation();

		Matrix X = matrixFrom2DArray(makeXMatrix(featuredScaledMap));
		Matrix Y = matrixFrom1DArray(makeYMatrix(featuredScaledMap));

		Matrix var = new Matrix(X.getRowDimension(), 1, 1.0);

		X = columnAppend(var, X);

		Matrix result = finalProduct(X, Y);

		System.out.println("Result : ");
		result.print(result.getRowDimension(), result.getColumnDimension());
		double[] resultArray = result.getRowPackedCopy();
		String output = "";

		System.out.println("The linear regression gives : ");
		output += "H(n) =" + resultArray[0] + " + ";
		for (int i = 1; i < resultArray.length - 1; i++) {
			output += resultArray[i] + getComplexity(i) + ") + ";
		}
		output += resultArray[resultArray.length - 1] + getComplexity(resultArray.length - 1) + ")";

		System.out.println(output);
		double max = Double.MIN_NORMAL;
		int complexity = -1;

		System.out.println("resultArray : ");

		for (int i = 0; i < resultArray.length; i++) {
			System.out.println("result[" + i + "] : " + resultArray[i]);
		}

		for (int i = 1; i < resultArray.length; i++) {
			for (int j = 0; j < Settings.nbSample; j++) {
				if (resultArray[i] > max) {
					max = resultArray[i];
					complexity = i;
				}
			}
		}

		System.out.println("Average complexity of the current Algortihm : " + getComplexity(complexity));

	}

	private static String getComplexity(int i) {
		switch (i) {
		case 1:
			return " O(log(n))";

		case 2:
			return " O(n)";

		case 3:
			return " O(nlog(n))";

		case 4:
			return " O(n^2)";

		case 5:
			return " O(n^2log(n))";

		case 6:
			return " O(n^3)";

		default:
			return "ERRRRRRROR";
		}
	}

}