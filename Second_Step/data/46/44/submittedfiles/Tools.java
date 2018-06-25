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
        int c = 0;
        for ( int i = 0 ; i < n ; i++ ){
            for ( int j = 0 ; j < n ; j++){
                if ( tab[i] + tab[j] == 0 ){
                    c++;
                }
            }
        }
        return c/2 ;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n = tab.length;
        int c = 0;
        for ( int i = 0 ; i < n ; i++ ){
            for ( int j = 0 ; j < n ; j++){
                if ( tab[i] + tab[j] == 0 ){
                    c++;
                }
            }
        }
        return c/2 ;

    }

}