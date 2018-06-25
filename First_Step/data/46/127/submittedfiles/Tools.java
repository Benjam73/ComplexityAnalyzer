/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compteur=0;
        int sum=1;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                sum=tab[i]+tab[j];
                if(sum==0){
                    compteur++;
                }
            }
        }
    return compteur/2;
    }

    

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int compteur=0;
        int sum=1;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                sum=tab[i]+tab[j];
                if(sum==0){
                    compteur++;
                }
            }
        }
    return compteur/2;
    }
}