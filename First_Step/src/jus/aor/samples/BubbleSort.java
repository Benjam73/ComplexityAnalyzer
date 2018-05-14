package jus.aor.samples;

public class BubbleSort {

	public static int[] bubbleSort(int[] T) {
		int i, j;
		for (i = T.length; i != 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (T[j + 1] < T[j]) {
					exchange(T, j, j + 1);
				}

			}
		}

		return T;
	}

	private static void exchange(int[] tab, int j, int i) {
		int tmp;
		tmp = tab[j];
		tab[j] = tab[i];
		tab[i] = tmp;
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

		int[] SortedTab = bubbleSort(tab);

		System.out.println("\n After sort : \n");
		for (int i = 0; i < n; i++) {
			System.out.println("SortedTab[" + i + "] = " + SortedTab[i]);
		}
	}

}
