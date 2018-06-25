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
        //TODO
        int j=0;
        int c=0;
        boolean trie = false;
        while(!trie && j<tab.length ){
                trie=true;
            for(int k=0; k<tab.length-j-1;k++){
               
                if(tab[k+1]<tab[k]){
                    c=tab[k];
                    tab[k]=tab[k+1];
                    tab[k+1]=c;
                    trie=false;
                }
            }
            j+=1;
            
        }
        
        }
        
    }

