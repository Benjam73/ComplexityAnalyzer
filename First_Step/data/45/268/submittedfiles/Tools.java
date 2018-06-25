/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void swap (int [] t, int idx1, int idx2) {
        int temp = t[idx1];
        t[idx1] = t[idx2];
        t[idx2] = temp;
    }

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j<tab.length-1; j++) {
                if (tab[j] > tab[j+1]) {
                    swap (tab, j, j+1);
                }
            }
        }
        return tab;
    }

}