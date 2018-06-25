/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    public static int[] sortBubble(int[] tab) {
        boolean estTrie = false;
        while(!estTrie) {
            estTrie = true;
            
            for(int k=0; k < tab.length-1; k++) {
                if(tab[k] > tab[k+1]) {
                    echanger(tab, k, k+1);
                    estTrie = false;
                }
            }
        }
        return tab;
    }
    
    public static void echanger(int[] tab, int i, int j) {
        int a = tab[i];
        tab[i] = tab[j];
        tab[j] = a;
    }



    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        return fastNumberOfCancellations(tab);
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        sortBubble(tab);
        
        int nb = 0;
        int i = 0;
        int j = tab.length -1;
        
        while(i < j) {
            if(tab[i] == - tab[j]) {
                nb ++;
                i ++;
                j --;
            } else if(tab[i] + tab [j] > 0) {
                j --;
            } else {
                i ++;
            }
        }
        
        return nb;
        
    }

}