import java.util.Arrays;
/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nb = 0;
        for (int i=0; i<tab.length ;i++) {
            for (int j=i;j<tab.length-1;j++) {
                if (tab[j]==-tab[i]) {
                    nb++;
                }
            }
        }
        return nb;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int nb=0;
        int i=0;
        int j=tab.length-1;
        while (i<j) {
            if (tab[i]+tab[j]==0) {
                i++;
                j--;
                nb++;
            }
            else if (tab[i]+tab[j]>0) {
                j--;
            }
            else {
                i++;
            }
        }
        return nb;
    }

}