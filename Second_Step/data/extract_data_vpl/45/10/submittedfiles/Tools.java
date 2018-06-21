/**
 * A class providing a static method for sorting.
 */
public class Tools {
    private int [] tab;
    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
     
    public static void echanger(int[] tab, int idx1, int idx2){
        int temp = tab[idx1];
        tab[idx1] = tab[idx2];
        tab[idx2] = temp;
    } 
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        boolean trie=false;
        while (!trie){
            trie=true;
            for (int j=0; j<n-1; j++){
                if(tab[j]>tab[j+1]){
                    echanger(int[] tab; tab[j]; tab[j+1]);
                    trie=false;
                }
            }
        }
    }

}