/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
     public static int numberOfCancellations(int[] tab) {
    	int s=0;
    	for ( int i=0 ; i< tab.length; i++) {
    		for ( int j=0 ; j<tab.length; j++) {
    			if ( tab[i]+tab[j]==0) {
    				s++;
    			}
    		}
    	}
    	return s;
    }

    
    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	int[] tab1;
    	int s1 =0;
    	for ( int j=0; j<tab.length ; j++)  {
    		Math.abs(j);
    		Arrays.sort(tab1);
    	}
    	for ( int i=0 ; i<tab.length ; i++) {
    		if ( tab[i] == tab[i+1]) {
    			s1++;
    		}
    	}
    	return s1;

    }

}
