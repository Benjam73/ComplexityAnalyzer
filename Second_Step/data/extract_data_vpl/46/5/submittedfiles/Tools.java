/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n = tab.length;
        int count = 0;
        for(int i=0; i<n; i++){
          if(tab[i]==tab[i++]){
              count++;
          }
            
        }

    }
}

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n = tab.length;
        int count = 0;
        array.sort[tab];
        for(int i=0; i<n; i++){
          if(tab[i]==tab[i++]){
              count++;
          }
    }

}
}