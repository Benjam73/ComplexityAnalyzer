/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
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

}