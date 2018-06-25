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
        int n=tab.length;
        int nbPairs = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (tab[i]+tab[j] ==0){
                    nbPairs = nbPairs + 1;
                }
            }
        }
        return(nbPairs);
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static void sortBubble(int[] tab) {
        int n = tab.length;
        int fin =1;
        while (fin!= n){
            for (int i=0; i<=n-1-fin; i++){
                if (tab[i]>tab[i+1]){
                    int permut = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=permut;
                }
            }
        fin++;
        }
    }
    
    public static int fastNumberOfCancellations(int[] tab) {
        sortBubble(tab);
        int nbPairs = 0;
        int begin = 0;
        int end = tab.length - 1;
        while (tab[begin]<0 && tab[end]>0 && begin<end){
            if (tab[begin] + tab[end] ==0){
                nbPairs++;
            }if (-tab[begin]>tab[end]){
                begin++;
            }else{
                end =end-1;
            }
        }
    return(nbPairs);
    }

}