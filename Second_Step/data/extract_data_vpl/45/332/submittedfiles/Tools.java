/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void echanger(int[] t, int idx1, int idx2){
        int temp=t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    }

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        boolean trie=false;
        while(!trie){
            trie=true;
            for(int j=0; j<n-1; j++){
                if(tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                    trie=false;
                }
        
            }
        }
    
    }
}



