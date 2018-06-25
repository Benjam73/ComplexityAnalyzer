/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
import java.util.Arrays;
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
    public static void swap ( int tab[] , int idx1 , int idx2 ) {
        int temp = tab[idx1] ;
        tab[idx1] = tab[idx2] ;
        tab[idx2] = temp ;
    }
    
    public static void sortBubble1(int[] tab) {
        int n = tab.length;
        for (int i = 0 ; i < n ; i++ ){
            for (int j = 0 ; j < n - 1 ; j++){
                if (tab [j] > tab [j+1]){
                    swap (tab, j , j+1);
                }
            }
        }
    }
    
    public static void sortBubble(int[] tab){
        Arrays.sort(tab);
        int n = tab.length;
        int fin = 0;
        boolean NotSorted = true;
        while (NotSorted){
            NotSorted = false;
            for (int i=0; i< n-1-fin ; i++){
                if ( tab[i] > tab[i+1]){
                    swap (tab, i, i+1);
                    NotSorted = true;
                }
            }
        fin ++;
        }
    }

}
