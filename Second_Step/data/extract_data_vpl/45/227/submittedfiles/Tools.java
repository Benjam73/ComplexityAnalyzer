/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
    public static void echange(int[] t,int i,int j){
        int o = t[i];
        t[i] = t[j];
        t[j] = o;
        
        
        
    } 
     
    public static void sortBubble(int[] tab) {
        int j = 0;
        boolean trie = false;
        while(j<tab.length && !trie){
            trie = true;
            for(int i =0; i<tab.length-j-1 ; i++){
                if(tab[i]>tab[i+1]){
                    echange(tab,i,i+1);
                    trie = false;
                    
                }
            }
            j++;
            
                
                
                
            
            
        }
    }

}