/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n=tab.length;
        int sum=0;
        for(int i =0; i<n; i++){
            for(int k =0; i<n; i++){
                if(tab[i]==-tab[k]){
                    sum++;
                }
            
        }
          return sum;
    }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    Tools.sortFast(tab);
    int n=tab.length;
    int sum;
    for(int i =0; i<n; i++){
        if(tab[i]<0){
            a=i;
        
    
    }
    }
}
}