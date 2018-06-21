import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
	public static int numberOfCancellations( int[] tab){
		int nbpairs = 0;
		for ( int i = 0; i < tab.length; i++) {
			for ( int j = i+1; j < tab.length; j++) {
					if (tab[i] + tab[j] == 0) {
						nbpairs = nbpairs + 1;
					}
				}
			}
		return nbpairs;
		}

    
    
    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	sortBubble(tab);
    	int first = 0;
    	int last = tab.length-1;
    	int nbpair = 0;
    	while(tab[first] < 0 && tab[last] > 0 && first < last) {
    		if (tab[first] + tab[last] == 0) {
    			nbpair += 1;
    	}
    		if (-tab[first] > tab[last]) {
    			first += 1;
    		} else {
    			last -= 1;
    		}
    	}
    	return nbpair;
    }
    
    public static void sortBubble(int[] tab) {
    	int n = tab.length;
    	for (int i = 0 ; i < n; i++) {
    		for (int j = 0 ; j < n-i-1 ; j++) {
    			if ( tab[j] > tab[j+1] ) {
    				int x = tab[j+1];
    				tab[j+1] = tab[j];
    				tab[j] = x;
    			}
    		}
    	}
    	
    	
    	
    	}
 

}