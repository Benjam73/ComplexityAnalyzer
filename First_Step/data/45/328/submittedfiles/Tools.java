/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean trie = false;
        while(trie==!true){
            trie=true;
            for(int j =0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    int memoire=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=memoire;
                    trie=false;
                }
            }
        }
      return tab;  
    }

}