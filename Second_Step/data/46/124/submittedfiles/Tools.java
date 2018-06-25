/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int i=0;
        int p=0;
        while(i<tab.length-1){
            for(int j=0;j<tab.length-1;j++){
                if(tab[i]==-tab[j]){
                    p=p+1;
                }
            }
            i++;
        }
        return p;
    }


   
}