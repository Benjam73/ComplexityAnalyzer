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
        int somme=0;
        for(int i=0; i<tab.length; i++){
            for (int j=i+1; j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    somme++;
                }
            }
        }
        return somme;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int first=0;
        int last=tab.length-1;
        int nbpaire=0;
        while(tab[first]<0 && tab[last]>0 && first<last){
            if(tab[first]+tab[last]==0){
                nbpaire+=1;
            }
            if(-tab[first]>tab[last]){
                first+=1;
            }
            else{
                last -=1;
            }
        }
        return nbpaire;

    }

}