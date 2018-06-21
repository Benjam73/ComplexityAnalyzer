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
        
        for(int i=n; i>1; i--){
            for(int j=0; j<n-1; j++){
                if(tab[j]>tab[j+1]){
                    int tp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tp;
                    
                }
            }
        }
        
        return tab;
        
    }

}