/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbPaire=0;
        for (int i=0; i<tab.length-1; i++){
            for (int j=0; j<tab.length; j++){
                if (tab[i]==-tab[j]){
                    nbPaire=nbPaire+1;
                }
            }
        }
        return nbPaire;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {

    }

}