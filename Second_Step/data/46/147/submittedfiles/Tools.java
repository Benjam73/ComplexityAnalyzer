/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int k=0;
        for (int i=0;i<tab.length;i++){
            for (int j=0;j<tab.length;j++){
                if (tab [i]==-tab[j]){
                    k=k+1;
                }
            }
        }
        return k/2;
    }
    
   
   
    public static int fastNumberOfCancellations(int[] tab) {
        int k=0;
        for (int i=0;i<tab.length;i++){
            for (int j=0;j<tab.length;j++){
                if (tab [i]==-tab[j]){
                    k=k+1;
                }
            }
        }
        return k/2;
    }
}