/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {
    private int [] tab;

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int c=0;
        for (int i=0; i<tab.length; i++){
            for (int k=i+1; k<tab.length; k++){
                if(tab[i]==-tab[k]){
                c=c+1;
                }
            }
        return c/2;
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
   public static int fastNumberOfCancellations(int[] tab) {
        for (int i = 0; i<tab.length; i++){
    		tab[i]= Math.abs(tab[i]);
    	}
    	Arrays.sort(tab);
    	int c2=0;
    	for (int i = 0 ; i<tab.length-1; i++){
    		if (tab[i]==tab[i+1]){
    			c2=c2+1;
    		}
    	}
    	return c2;
    }
}