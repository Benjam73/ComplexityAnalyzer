import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {
    private int[] tab;

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
            int nb = 0;
            for (int i=0; i<tab.length; i++){
                for (int j=0; j<tab.length; j++){
                    if (tab[i]+tab[j]==0){
                        nb+=1;
                    }
                }
            }
            return nb/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int first = 0;
        int last = tab.length;
        
            
    }   

}