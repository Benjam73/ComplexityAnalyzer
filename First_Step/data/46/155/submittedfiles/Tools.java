/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n=tab.length;
        int val=tab[i];
        int sum=0;
        for(int i=0,i<n-1, i++){
            for(int k=i,k<n-1,k++){
                if(val+tab[k]==0){
                    sum++;
                }
            }
        }
        return sum/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n=tab.length;
    	for (int i = 0; i<n; i++){
    		tab[i]= Math.abs(tab[i]);
    
    	Arrays.sort(tab);
    	int sum=0;
    	for (int i = 0 ; i<n-1; i++){
    		if (tab[i]==tab[i+1]){
    			sum++;
    		}
    	}
    	return sum;
	}
}