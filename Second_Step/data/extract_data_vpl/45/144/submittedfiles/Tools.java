/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n=tab.length;
        int k=0;
        boolean trie=false;
        while (k<n-1 && trie==false){
            trie=true;
            for (int i=0;i<n-1-k;i++){
                int p=0;
                if (tab[i]>tab[i+1]){
                    p=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=p;
                    trie=false;
                }
            }
            k+=1;
        }
    }

}