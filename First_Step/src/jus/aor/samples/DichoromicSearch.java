package jus.aor.samples;

public class DichoromicSearch {

	public static boolean isPresent(int[] tab, int element) {
		int left = 0;
		int right = tab.length - 1;
		boolean find = false;

		while (left <= right && !find) {
			int middle = (left + right) / 2;
			if (tab[middle] < element) {
				left = middle + 1;
			} else if (tab[middle] > element) {
				right = middle - 1;
			} else {
				find = true;
			}
		}

		return find;
	}

	public static void main(String[] args) {
		int n = 100;
		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			tab[i] = i;
		}

		for (int i = 0; i < n; i++) {
			System.out.println("tab[" + i + "] = " + tab[i]);
		}

		System.out.println((isPresent(tab, 14)) ? "oui" : "non");
	}

}
