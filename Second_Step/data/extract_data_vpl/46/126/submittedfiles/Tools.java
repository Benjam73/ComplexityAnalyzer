/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int somme = 0 ; 
        int i = 0 ; 
        int n = tab.length ;
        while (i<n-1){
            for (int j=i+1 ; j<n ; j++){
                if (tab[i]+tab[j]==0){
                    somme = somme + 1 ; 
                }
            }
            i++; 
        }
        return somme ; 

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int somme = 0 ; 
        int i = 0 ; 
        int n = tab.length ;
        while (i<n-1){
            for (int j=i+1 ; j<n ; j++){
                if (tab[i]+tab[j]==0){
                    somme = somme + 1 ; 
                }
            }
            i++; 
        }
        return somme ; 
    }

}