import java.util.Arrays;
/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum=0;
        for (int i=0;i<tab.length;i++){
            for (int j=i+1;j<tab.length;j++){
                if (tab[i]==-tab[j]){
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
        int n=tab.length;
        int sum=0;
        for (int i=0;i<n;i++){
            tab[i]=Math.abs(tab[i]);
        }
        Arrays.sort(tab);
        for (int i=0;i<n-1;i++){
            if (tab[i]==tab[i+1]){
                sum++;
            }
        }
        return sum;

    }

}