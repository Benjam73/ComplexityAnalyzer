/**
 * A class providing static methods for zero pairs algorithms.
 */
import java.util.Arrays;

public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n = tab.length;
        int c =0;
        boolean[] a = new boolean[n];
        for (int i = 0;i<n;i++){
            a[i] = true;
        }
        for (int i = 0; i<n; i++){
            
            for (int j = 0 ; j<n; j++){
                
                if ((tab[i] == -tab[j]) && ((a[i]&&a[j]) == true) && (i!=j)){
                    c = c+1;
                    a[i] = false;
                    a[j] = false;
                }
            }
        }
        return c;
    }
        


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int n = tab.length;
        int c = 0;
        int i = 0;
        int j = 0;
        while(i < n-1-j ){
            if (tab[i] + tab[n-1-j] == 0){
                c = c+1;
                i = i+1;
                j = j+1;
            } else if (tab[i] + tab[n-1-j]<0){
                i = i+1;
            } else{
                j = j+1;
            }
        }
        return c;
    }

}