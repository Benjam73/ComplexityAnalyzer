package jus.aor.samples;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] tab) {

		if (tab.length > 1) {
			int[] leftTab = Arrays.copyOfRange(tab, 0, tab.length / 2);
			int[] rightTab = Arrays.copyOfRange(tab, tab.length / 2, tab.length);
			leftTab = mergeSort(leftTab);
			rightTab = mergeSort(rightTab);
			return Merge(leftTab, rightTab);

		} else {
			return tab;
		}
	}

	private static int[] Merge(int[] leftTab, int[] rightTab) {
		int totalLength = leftTab.length + rightTab.length;
		int[] tab = new int[totalLength];
		int index1 = 0, index2 = 0;

		for (int i = 0; i < totalLength; i++) {
			if (index1 < leftTab.length && (index2 == rightTab.length || leftTab[index1] < rightTab[index2])) {
				tab[i] = leftTab[index1];
				index1++;
			} else {
				tab[i] = rightTab[index2];
				index2++;
			}
		}

		return tab;
	}

	public static void main(String[] args) {
		int n = 100;
		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			tab[i] = (int) (Math.random() * 2500);
		}

		System.out.println("Before sort : \n");
		for (int i = 0; i < n; i++) {
			System.out.println("tab[" + i + "] = " + tab[i]);
		}

		int[] SortedTab = mergeSort(tab);

		System.out.println("\n After sort : \n");
		for (int i = 0; i < n; i++) {
			System.out.println("SortedTab[" + i + "] = " + SortedTab[i]);
		}

	}
}
