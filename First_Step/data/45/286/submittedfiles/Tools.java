/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        int i=0;
        boolean trie=false;
        while(!trie){
            trie=true;
            for (int j=0; j<n-1; j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                    trie=false;
                }
            }
        }
        return tab;
    }
    
    public static void echanger(int tab[], int i, int j){
        int mem=tab[i];
        tab[i]=tab[j];
        tab[j]=mem;
    }
}