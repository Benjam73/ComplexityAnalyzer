import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum = 0;
        for (int i =0;i<tab.length;i++){
            for (int j =0;j<tab.length;j++){
                if (tab[i]==-tab[j]){
                    sum ++;
                }
            }
        }
        return sum/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        
        Arrays.sort(tab);
        
        return 0;
    }

}