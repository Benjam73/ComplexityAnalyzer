import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compt = 0;
        int value = 0;
        for(int i=0;i<tab.length;i++){
            for(int j=i;j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    compt = compt + 1;
                }
            }
        }return(compt);

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int compt = 0;
        int value = 0;
        for(int i=0;i<tab.length;i++){
            for(int j=i+1;j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    compt = compt + 1;
                }
            }
        }return(compt);

    }

}