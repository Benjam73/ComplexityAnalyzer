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
        int nbpaires=0;
        for (int i=0; i<tab.length; i++){
            for (int j=i+1; j<tab.length; j++){
                if (tab[i]+tab[j]==0){
                    nbpaires ++;
                }
            }
        }
        return nbpaires;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        sortBubble(tab);
        int nbpaires=0;
        for (int i=0; i<tab.length; i++){
            if (estPresent(tab, -tab[i])==true){
                nbpaires ++;
            }
        }
        return nbpaires;

    }
    
    public static void sortBubble(int[] tab) {
        boolean tabdejatri=false;
        int l = tab.length;
        int i=0;
        while (i<=l-1 && !tabdejatri){
            tabdejatri=true;
            for (int k=0; k<l-1-i; k++){
                if (tab[k]>tab[k+1]){
                    echange(tab, k, k+1);
                    tabdejatri=false;
                }
            }
            i++;
        }
    }
    
    public static void echange(int[]tab, int i1, int i2){
        int temp=tab[i1];
        tab[i1]=tab[i2];
        tab[i2]=temp;
    }
    
    public static boolean estPresent (int[] tab, int elt){
        int gauche=0;
        int droite= tab.length-1;
        boolean trouve = false;
        while (gauche<=droite && !trouve){
            int milieu = (gauche+droite)/2;
            if (tab[milieu]<elt){
                gauche=milieu+1;
            }else{
                if (tab[milieu]>elt){
                    droite=milieu-1;
                }else{
                    trouve=true;
                }
            }
        }
        return trouve;
    }

}