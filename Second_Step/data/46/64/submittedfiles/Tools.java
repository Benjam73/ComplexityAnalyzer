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
        int somme = 0;
        int n = tab.length;
        for (int i =0; i<n; i++){ 
            for (int j = 0; j<n; j++){
                if (tab[i] == -tab[j] && i!=j ){
                    somme +=1;
                }
            }
        }
        
        return somme/2;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n = tab.length;
        int [] valeursAbsolues = new int[n];
        for (int i = 0; i<n; i++){
            valeursAbsolues[i] = Math.abs (tab[i]);
        }
        Arrays.sort(valeursAbsolues);
        int somme =0;
        int i=1;
        while (i<n){
            if (valeursAbsolues[i-1] ==valeursAbsolues[i]){
                somme +=1;
                i+=2;
            }else{
                i+=1;
            }
        }
        return somme;
    }
    
    
    

    

}