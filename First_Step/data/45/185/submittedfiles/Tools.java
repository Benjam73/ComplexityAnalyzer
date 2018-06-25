/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
		boolean donc = false;
		while (!donc) {
			donc = true;
			for (int i = 0; i < tab.length-1; i++) {
				if (tab[i] > tab[i + 1] ) {
					int temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;
					donc = false;
				}
			}
		}
		return tab;
	}

}