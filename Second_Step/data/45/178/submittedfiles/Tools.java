/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n = tab.length;
        if (n!=0) {
        for (int i = 1; i<n; i++) {
            int j = i;
            while (tab[j]<tab[j-1] && j>0 ) {
                int temp = tab[j-1];
                tab[j-1] = tab[j];
                tab[j] = temp;
                j--;
            }
        }
        }
    }

}