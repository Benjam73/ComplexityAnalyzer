/**
 * A class providing a static method for sorting.
 */
public class Tools {

    public static void swap(int[] tab,int i, int j){
        int k = tab[i];
        tab[i] = tab[j];
        tab[j] = k;
    }
    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[i] <= tab[j]){
                    swap(tab,i,j);
                }
            }
        }
        return tab;
    }

}