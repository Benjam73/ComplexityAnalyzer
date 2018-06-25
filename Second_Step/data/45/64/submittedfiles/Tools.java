 /**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n =tab.length;
        int i = 0;
        boolean dejatrie = false;
        while (i < n-1 && !dejatrie){
            dejatrie = true;
            for (int j = 0; j<n-1-i;j++){
                if (tab[j]>tab[j+1]){
                    dejatrie = false;
                    int jold = tab[j+1];
                    tab [j+1] = tab[j];
                    tab[j] = jold;
                }
            }
            i = i+1;
        }   
        return tab;
    }
}