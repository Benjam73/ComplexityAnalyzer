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
        int counter=0;
        int n = tab.length;
        for ( int i = 0; i< n; i++){
            for ( int j =i+1; j< n; j++){
                if (tab[i]+tab[j]==0){
                    counter=counter+1;
                }
            }
        }
        return counter;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int counter =0;
        int n = tab.length;
        for (int i =0; i< n; i++){
            if (tab[i]!=0 && isPresent(tab, -tab[i])){
                counter = counter + 1 ; 
            }
        }
        return counter/2;

    }
    public static boolean isPresent(int[] tab, int elt){/* la méthode de dichotomie*/
        Arrays.sort(tab);/* methode dans le langage JAVA pour trier un tableau*/
        int gauche = 0;
        int droite = tab.length-1;
        boolean trouve =false;
        while ( gauche <= droite && !trouve){
            int milieu = ( gauche +droite)/2;
            if ( tab[milieu] < elt){
                gauche = milieu +1;
            }else{
                if ( tab[milieu]> elt){
                droite= milieu -1 ;
                }else{
                trouve =true;
                }
            }
        }
        return trouve;
    }
}