/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        for (int i=0; i <= n-1; i++){
            for (int j=0; j <= i; j++){
                if (tab[j]>tab[j+1]){
                    exchange(tab, j, j+1);
                }
            }
        }
    return tab;
    }

}