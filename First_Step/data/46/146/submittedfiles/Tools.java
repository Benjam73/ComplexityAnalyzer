/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
              int count=0;
           for(int i=0; i<tab.length-1; i++){
               for(int k=0; k<tab.length; k++){
                   if(tab[i]==-tab[k]){
                       count+=1;
                   }
               }
           } return count/2;
    }

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {

    }

}