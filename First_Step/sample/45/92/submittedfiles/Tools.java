/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */

    public static int[] sortBubble(int[] tab) {
        int l = tab.length;
        boolean change = false;
        while(!change && l>0){
            change = true;
            for(int k = 0; k < l-1; k++){
                if(tab[k] > tab[k+1]){
                    tab[k] = tab[k] + tab[k+1];
                    tab[k+1] = tab[k] - tab[k+1];
                    tab[k] = tab[k] - tab[k+1];
                    change = false;
                }
            }
            l--;
        }
        return tab;
    }
}