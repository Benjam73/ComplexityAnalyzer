import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbpairs = 0;
        for ( int i = 0; i < tab.length; i++) {
            for ( int j = i+1; j < tab.length; j++) {
                if (tab[i] + tab[j] == 0) {
                    nbpairs = nbpairs + 1;
                }
            }
        }
    return nbpairs;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int first = 0;
        int last = tab.length-1;
        int nbpair = 0;
        while(tab[first] < 0 && tab[last] > 0 && first < last) {
            if (tab[first] + tab[last] == 0) {
                nbpair = nbpair+ 1;
            }
            if (-tab[first] > tab[last]) {
                first = first + 1;
            } else {
                last = last - 1;
            }
        }
        return nbpair;

    }

}