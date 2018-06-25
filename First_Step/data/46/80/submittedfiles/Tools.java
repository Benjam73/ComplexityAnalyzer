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
        int nbpairs = 0;
        for (int i=0; i<tab.length; i++){
            for (int j=i+1; j<tab.length; j++){
                if (tab[i] + tab[j] ==0){
                    nbpairs ++;
                }
            }
        }
        return nbpairs;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
     
     
   /**
    * On trie la liste avant de lancer l'algo
    * */
    
    public static void swap(int [] t, int idx1, int idx2){
        int temp = t[idx1];
        t[idx1] = t[idx2];
        t[idx2]= temp;
    }
    public static void sortBubble(int[] tab) {
        boolean notsorted = true;
        int n = tab.length;
        int fin = 0;
        while ( notsorted){
            notsorted = false;
            for(int i =0; i<n-1-fin; i++){
                if (tab[i] > tab[i+1]){
                    swap(tab, i , i+1);
                    notsorted = true;
                }
            }
            fin++;
        }
    }



    // on suppose tab trié
    public static int fastNumberOfCancellations(int[] tab) {
//        sortBubble(int[] tab);
        int first = 0;
        int last = tab.length -1;
        int nbpairs = 0;
        while (tab[first]<0 && tab[last]>0 && first<last){
            if (tab[first] + tab[last] == 0){
                nbpairs ++;
            }
            if (-tab[first]>tab[last]){
                first ++;
            }else{
                last--;
            }
        }
        return nbpairs;
    }

}