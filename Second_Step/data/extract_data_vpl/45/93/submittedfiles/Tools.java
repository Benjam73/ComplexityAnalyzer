import java.util.Arrays;
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
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){   
                if(tab[j-1] > tab[j]){
                    temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;
                }
                               
            }
        }return tab;
    }
}