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
        trier(tab);
        int t=0;
        for (int k=0 ; k<tab.length-1 ; k++){
            for (int j=0 ; j<tab.length-1 ; j++){
                if (tab[j]==tab[j+1]){
                    t++;
                }
            }
        }
        return t;
        

    }
    
     
    public static void trier(int[] tableau) {
		int i, j, cle;
		
		for (i = 1; i < tableau.length; i++) {
			cle = tableau[i];
			j = i;
			while ((j >= 1) && (tableau[j - 1] > cle)) {
				tableau[j]  = tableau[j - 1] ;
				j = j - 1;
			}
			tableau[j] = cle;
		}
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        return 0;

    }

}