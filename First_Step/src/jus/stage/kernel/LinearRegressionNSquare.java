package jus.stage.kernel;

import java.util.HashMap;
import java.util.Map;

import Jama.Matrix;
import jus.stage.samples.BubbleSort;
import jus.stage.utils.Settings;

public class LinearRegressionNSquare {
	private static double[] makeXMatrix(HashMap<Double, Long> featuresWantedMap) {
		double[] result = new double[Settings.nbSample];
		int i = 0;
		for (Map.Entry<Double, Long> entry : featuresWantedMap.entrySet()) {
			result[i] = entry.getKey();
			i++;
		}

		return result;
	}

	private static double[] makeYMatrix(HashMap<Double, Long> featuresWantedMap) {
		double[] result = new double[Settings.nbSample];
		int i = 0;
		for (Map.Entry<Double, Long> entry : featuresWantedMap.entrySet()) {
			result[i] = entry.getValue();
			i++;
		}

		return result;
	}

	private static Matrix matrixFrom1DArray(double[] array) {
		return new Matrix(array, array.length);
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

	public static Matrix finalProduct(Matrix X, Matrix Y) {

		Matrix Xtranspose = transposeMatrix(X);
		Matrix XXtranspose = matrixProduct(Xtranspose, X);
		Matrix XtransposeY = matrixProduct(Xtranspose, Y);
		Matrix inverseXXtranspose = matrixInversion(XXtranspose);
		Matrix result = matrixProduct(inverseXXtranspose, XtransposeY);
		return result;

	}

	public static double[] doLinearRegression(HashMap<double[], Long> featuresMap) {
		HashMap<Double, Long> wantedFeature = Features.getWantedFeature(featuresMap, 3);
		Matrix X = matrixFrom1DArray(makeXMatrix(wantedFeature));
		Matrix Y = matrixFrom1DArray(makeYMatrix(wantedFeature));

		Matrix var = new Matrix(X.getRowDimension(), 1, 1.0);

		X = columnAppend(var, X);

		Matrix result = finalProduct(X, Y);

		return result.getRowPackedCopy();
	}

	public static void main(String[] args) {

		HashMap<double[], Long> featuresMap = BubbleSort.getObservation();
		doLinearRegression(featuresMap);
	}

}
