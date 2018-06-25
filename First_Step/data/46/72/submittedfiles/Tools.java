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
        int a = 0;
        for (int i=0 ; i<tab.length ; i++){
            for (int j=i+1 ; j<tab.length ; j++){
                if (tab[j]+tab[i]==0){
                    a=a+1;
                }
            }
        }
        return a;
    }



    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int a = 0 ;
        int j = 0 ;
        for (int i=0 ; i<tab.length ; i++){
            j = i+1;
            while (j!=tab.length){
                j+=1;
                 if (tab[j]+tab[i]==0){
                    a+=1;
                }
            }
        }
        return a;
    }

}