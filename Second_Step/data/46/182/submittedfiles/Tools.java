/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int count=0;
        for(int j=0; j<tab.length; j++){
        for(int i=j+1; i< tab.length; i++){
            if(tab[j]+tab[i]==0){
                count=count+1;
            }
        }
        }
        return count;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int count=0;
        for(int j=0; j<tab.length; j++){
        for(int i=j+1; i< tab.length; i++){
            if(tab[j]+tab[i]==0){
                count=count+1;
            }
        }
        }
        return count;

    }

}