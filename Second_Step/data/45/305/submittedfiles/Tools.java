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
        int temp=0;
        boolean trie=false;
        while(!trie){
            trie=true;
            for (int i=0; i<tab.length-1;i++){
                if (tab[i]>tab[i+1]){
                tab[i+1]=temp;
                temp=tab[i];
                tab[i]=tab[i+1];
                trie=false;
                }
            }
            
        }
        return tab;
        
    } 
    

}