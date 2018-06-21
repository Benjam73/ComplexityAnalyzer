/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     * 
     */
    public static void echange(int[] tab,int a, int b){
        int x=tab[a];
        tab[a]= tab[b];
        tab[b]=x;
        
    }
    public static void sortBubble(int[] tab) {
        int n = tab.length;
        int i=0;
        boolean dejatrie=false; 
        while(!dejatrie){
            dejatrie=true;
            for(int k=0; k<n-1;k++){
                if (tab[k]>tab[k+1]){
                    echange (tab, k, k+1);
                    dejatrie=false;
        
                }
            }
            i=i+1;    
        }
        
    }

}