/**
 * A class providing static methods for zero pairs algorithms.
 */
    import java.util.Arrays;

public class Tools {

 
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
	    int n=0;
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length;j++){
		    	if(tab[i]==-tab[j]){
			        n++;
		    	}
			}
		}
		return n/2;
    }
    
    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
           Arrays.sort(tab);
           int n=0;
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length;j++){
		    	if(tab[i]==-tab[j]){
			        n++;
		    	}
			}
		}
		return n/2;
    }

}