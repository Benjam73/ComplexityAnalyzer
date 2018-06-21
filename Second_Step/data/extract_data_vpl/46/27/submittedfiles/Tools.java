import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int s=0;
        for ( int i=0 ; i<tab.length-1 ; i++){
            for (int j=i+1 ; j<tab.length ; j++){
                if(tab[i]+tab[j]==0){
                    s=s+1;
                }
            }
            
        }
        return s;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        

    }

}