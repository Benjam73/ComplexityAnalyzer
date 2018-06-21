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
        int nbOfPairs = 0;
        for(int i = 0; i<tab.length; i++){
            for(int j = i+1; j<tab.length; j++){
                if(tab[i]+tab[j]==0){
                    nbOfPairs++;
                }    
            }
        }
        return nbOfPairs;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int nbOfPairs = 0;
        int gauche = 0;
        int droite = tab.length-1;
        while(gauche<droite){
            if(tab[gauche]+tab[droite]==0){
            nbOfPairs++;
            gauche ++;
            droite --;
            }
            if(tab[gauche]+tab[droite]<0){
                gauche++;
            }
            if(tab[gauche]+tab[droite]>0){
                droite--;
            }
        }
        return nbOfPairs;
    }

}