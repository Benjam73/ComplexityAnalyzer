import java.util.*;
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
        boolean echange = true;
        while(n>0 && echange == true){
            echange = false;
            for(int j = 0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    echange = true;
                }
                n--;
            }
        }
        return tab;
    }

}