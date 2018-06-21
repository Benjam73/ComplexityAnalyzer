/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        int i=0;
        boolean dejatrie = false;
        while (i< n-1 && !dejatrie) {
            dejatrie = true;
            for (int k=0; k< tab.length-1 -i ; k++) {
                 if (tab[k]>tab[k+1]) {
                    int p= tab[k];
                    tab[k]= tab[k+1];
                    tab[k+1]= p;
                    dejatrie = false;
                }
            }
            i=i+1;
        }
    return tab;
    }
}