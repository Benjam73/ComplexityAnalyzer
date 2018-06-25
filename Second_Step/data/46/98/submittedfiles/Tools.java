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
    int n = tab.length;
    int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(tab[j]+tab[i]==0){
                    c++;
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
        int first =0;
        int last = tab.length-1;
        int c=0;
        while(tab[first] < 0 && tab[last] > 0 && first < last) {
            if (tab[first] + tab[last] == 0) {
                     c= c+1;
            }
            if (-tab[first] > tab[last]) {
                    first = first + 1;
            }else {
                  last = last - 1;
            }
        }
        return c;
    }
}