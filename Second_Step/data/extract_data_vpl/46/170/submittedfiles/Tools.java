import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	boolean change = true;
    	int temp;
    	while (change) {
    	change = false;
    	for(int i=0; i<tab.length-1 ; i++) {
    	    if(tab[i]>tab[i+1]) {
    	        temp = tab[i];
    	        tab[i]=tab[i+1];
    	        tab[i+1]=temp;
    	        change = true;
    	    }
    	}
    	}
    	int i =0;
    	int j =tab.length-1;
    	int nb = 0;
    	while(i<j) {
    		if(-tab[i]==tab[j]) {
    			nb++;
    			i++;
    			j--;
    			
    		}
    		else if (-tab[i]>tab[j]) {
    			i++;
    		}
    		else {
    			j--;
    		}
    	}
    	return nb;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	Arrays.sort(tab);
    	int i =0;
    	int j =tab.length-1;
    	int nb = 0;
    	while(i<j) {
    		if(-tab[i]==tab[j]) {
    			nb++;
    			i++;
    			j--;
    			
    		}
    		else if (-tab[i]>tab[j]) {
    			i++;
    		}
    		else {
    			j--;
    		}
    	}
    	return nb;
    	
    		
    	
    }

}