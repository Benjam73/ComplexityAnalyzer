/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int count=0;
        for(int i=0;i<tab.length;i++){
            int val=tab[i];
            for(int j=i; j<tab.length;j++){
                if(tab[j]==-val){
                    count++;
                    j=tab.length;
                }
            }
        }
        return count;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {

 

}