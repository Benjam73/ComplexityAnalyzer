/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static int[] swap(int[] tab, int i, int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
        return tab;
    }
    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for(int i =0; i<tab.length; i++){
            for(int j =0; j<tab.length-1-i; j++){
                if(tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                }
            }
        }
        return tab;
    }
    
}