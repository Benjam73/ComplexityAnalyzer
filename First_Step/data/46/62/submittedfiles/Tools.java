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
        int nb = 0;
        for (int i=0; i<tab.length; i++){
            for (int k=0; k<tab.length && k!=i; k++){
                if (tab[k]+tab[i]==0){
                    nb = nb + 1;
                }
            }
        }
        return nb;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int nb = 0;
        for (int i=0; i<tab.length; i++){
            for (int k=0; k<tab.length && k!=i; k++){
                if (tab[k]+tab[i]==0){
                    nb = nb + 1;
                }
            }
        }
        return nb;

    }

}