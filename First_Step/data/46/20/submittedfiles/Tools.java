import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {
    
 
    
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compteur = 0;
        for (int i = 0; i<tab.length; i++){
            for (int j =i+1; j<tab.length; j++){
                if (tab[j]+tab[i]==0 ){
                    compteur++;
                }
            }
        }
        return compteur;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
       return 0;
    }

}