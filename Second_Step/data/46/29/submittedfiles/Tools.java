import java.util.Arrays;
import java.lang.Math;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int N=0;
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab.length;j++){
                if(tab[i]==-tab[j] && i!=j){
                    N++;
                    tab[j]=tab[i];
                }
            }
        }
        return(N);
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int N=0;
        int i=0;
        int j=tab.length;
        while(i<j){
            if(Math.abs(tab[i])<Math.abs(tab[j])){
                i++;
            }else if(Math.abs(tab[i])>Math.abs(tab[j])){
                j++;
            }else{
                N++;
            }
        }
        return(N);
    }

}