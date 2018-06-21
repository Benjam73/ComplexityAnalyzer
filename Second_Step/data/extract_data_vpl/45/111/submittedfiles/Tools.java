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
        while( n > 0 ){
            for ( int i = 0 ; i < n-1 ; i++){
                int a = 0;
                if (tab[i+1] < tab[i] ){
                    a = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = a;
                     
                    
                }
            }
            n--;
            
        }
        return tab;
    }

}