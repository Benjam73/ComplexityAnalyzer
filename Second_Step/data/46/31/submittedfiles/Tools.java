import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum =0;
        int n = tab.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (tab[i]+tab[j]==0){
                    sum++;
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
        
        int sum =0;
        int n = tab.length;
        int i=0;
        
        while(i<n && tab[i]<0){
            for (int j=i+1;j<n;j++){
                if (tab[i]+tab[j]==0){
                    sum++;
                }
            }
        i++;
        }
        
        return sum;

    }

}