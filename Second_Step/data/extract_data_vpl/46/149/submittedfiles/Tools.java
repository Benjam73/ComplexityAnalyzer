 import java.util.Arrays;
/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum=0;
        for (int i=0; i<tab.length; i++) {
            for (int j=i+1; j< tab.length; j++) {
                if (tab[i]+tab[j]==0) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int sum1=0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i]<0) {
                tab[i]=-tab[i];
            }
        }
        Arrays.sort(tab);
        for (int i=0; i<tab.length; i++) {
            if (tab[i]==tab[i+1]) {
                    sum1 += 1;
            }
        }
    return sum1;
    }
}