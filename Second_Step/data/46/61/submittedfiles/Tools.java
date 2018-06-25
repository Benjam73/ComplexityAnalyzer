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
        int nbCancellations = 0 ;
        int n = tab.length ;
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                if (tab[i] == -tab[j] && tab[i] > 0){
                    nbCancellations += 1 ;
                }
            }    
        }
        return nbCancellations ;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
     
    public static int fastNumberOfCancellations(int[] tab) {
        int n = tab.length ;
        int [] tabVAbsolues = new int[n];
        for (int i = 0; i<n; i++){
            tabVAbsolues[i] = Math.abs (tab[i]);
        }
        Arrays.sort(tabVAbsolues);
        int somme =0;
        int i=1;
        while (i<n){
            if (tabVAbsolues[i-1] ==tabVAbsolues[i]){
                somme +=1;
                i+=2;
            }else{
                i+=1;
            }
        }
        return somme;
    }
}