/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
    public static void echanger(int[] t, int idx1, int idx2){
        int temps=t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temps;
    }
    
    
    public static void sortBubble(int[] tab) {
        //TODO
        int n = tab.length;
        int k = n-1;
        boolean trie = false;
        while (k!=0 && trie==false) {
            trie = true;
            for (int i=0; i<k; i++){
                if (tab[i]>tab[i+1]){
                    echanger (tab, i, i+1);
                    trie = false;
                }
            }
            k--;
        }
    }

}