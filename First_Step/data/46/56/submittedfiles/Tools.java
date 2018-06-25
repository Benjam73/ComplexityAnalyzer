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
        int c=0;
        for (int i=0; i<tab.length; i++){
            for (int k=i+1;k<tab.length;k++){
                if (tab[k]+tab[i]==0){
                    c=c+1;
                }
            }
        }
        return c;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int k=0;
        for (int i=0; i<tab.length;i++){
            for (int l=i+1;l<tab.length;l++){
                if (tab[l]+tab[i]==0){
                    k=k+1;
                }
            }
        }
            return k;
    }
}