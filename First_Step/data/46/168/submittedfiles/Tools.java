/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int x = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                if(tab[i]+tab[j]==0){
                    x=x+1;
                }
            }
        }
        return x/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    return 0;
    }

}