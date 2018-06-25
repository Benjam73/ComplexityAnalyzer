import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
   public static int numberOfCancellations(int[] tab) {
       int n = tab.length;
       int compt = 0 ;
       for(int j= 0 ; j<n ; j++){
           for(int i = 0 ; i<n ; i++){
               if (tab[j] == Math.abs(tab[i]) && i!=j){
                   compt++;
                   ;
           }
       }
           
       }
       return compt;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        return 0;

    }

}