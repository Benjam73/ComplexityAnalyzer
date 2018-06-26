/**
 * A class providing static methods for zero pairs algorithms.
 */
 
import java.util.Arrays; 
public class Tools {


    
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */

    public static int numberOfCancellations(int[] tab) {
    	int sum=0;
        int n=tab.length-1;
        for (int i=0; i<n ; i++){
        	int tmp=(-1)*tab[i];
        	for (int j=i; j<n ; j++){
        		if (tmp==tab[j]){
        			sum+=1;
        		}
        	}
        }
        return sum;
        
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	Arrays.sort(tab);

    	int first=0; 
    	int last=tab.length-1;
    	int sum=0;
    	while (tab[first]<0 && tab[last]>0 && first<last){
    		if (tab[first]+tab[last]==0){
    			sum=sum+1;
    		}
    		if (-tab[first]>tab[last]){
    			first = first + 1;
    		} else {
    			last=last-1;
    		}
    	}
    	return sum;
    }
}
