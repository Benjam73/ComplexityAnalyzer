import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {
    private int []tab;
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        for (int i=0;i<tab.length();i++){
            for (int j=i+1;j<tab.length();j++){
                if (tab[i]+tab[j]==0){
                    return (i;j);
                }
            }
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {

    }

}