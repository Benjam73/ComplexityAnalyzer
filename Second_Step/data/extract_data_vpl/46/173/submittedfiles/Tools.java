/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int a=0;
        for (int i=0; i<=tab.length-1; i++){
            for (int j=i+1; j<=tab.length; j++){
                if (tab[i]+tab[j]==0){
                    a=a+1;
                }
            }
        }
        return a;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        return 0;
    }

}