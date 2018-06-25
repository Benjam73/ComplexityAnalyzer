/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
   public int tab[] ;
   
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n = tab.length ;
        boolean trie = false ;
        int k = 0 ;
        while (k<n && trie == false){
            trie = true ;
            for(int i=0; i<n-1;i++){
                if(tab[i]>tab[i+1]){
                     int j = tab[i];
                     tab[i] = tab[i+1];
                     tab[i+1] = j;
                     trie = false;
                }
            
            }
        k = k+1;
        }
    }            

}