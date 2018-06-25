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
        int k = 0; //compteur
        for (int i =0; i< tab.length-1; i++){
            for (int e = i+1; e<tab.length; e++){
                if (tab[i] + tab[e] == 0){ //on test si il y un nombre opposé à tab[i] dans le tableau
                    k+=1;
                }
            }
        }
        return k ;
    }

    

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int first = 0;
        int last = tab.length -1;
        int nbpair = 0;
        while (tab[first] < 0 && tab[last] > 0 && first < last){
            if (tab[first] + tab[last] == 0 ){
                nbpair += 1;
            }
            if (-tab[first] > tab[last]){
                first += first;
            } else {
                last = last -1;
            }
        }
        return nbpair;
    }

}