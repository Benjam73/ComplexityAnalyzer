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
        int N  = 0;
        int erreur = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                if(tab[i] == -tab[j]){
                    N++;
                    erreur++;
                }
            }
        }
        for(int k=0; k<tab.length;k++){
            if(tab[k]==0){
                N--;
                erreur--;
            }
        }
        return(N-(erreur/2));

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    //public static int fastNumberOfCancellations(int[] tab) {
        //return null;

    //}

}