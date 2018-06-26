/**
 * A class providing static methods for zero pairs algorithms.
 */
import java.util.Arrays;
public class Tools {
    

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
         int somme=0;
        int n=tab.length;
        for(int i=0; i<n; i++){
            for(int g=0; g<n; g++){
                if( tab[i] + tab[g] == 0){
                    somme=somme + 1;
                }
            }
        }
        return somme/2;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        for (int i = 0; i<tab.length; i++){
    		tab[i]= Math.abs(tab[i]);
    	}
    	Arrays.sort(tab);
    	int sum=0;
    	for (int i = 0 ; i<tab.length-1; i++){
    		if (tab[i]==tab[i+1]){
    			sum++;
    		}
    	}
    	return sum;
         
    }

    }
