/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
     public static void echange (int []tab,int i, int j){
         int mem=tab[i];
         tab[i]=tab[j];
         tab[j]=mem;
     }
     
     
    public static void sortBubble(int[] tab) {
        int j = 0;
        boolean dejatrie = false; 
        while (!dejatrie&&j<tab.length) {
            dejatrie = true;
            for ( int i = 0; i<tab.length-1; i++) {
                 if (tab[i] > tab[i+1]) {
                    echange(tab, i, i+1); 
                    dejatrie = false;
                }
            }
        j++;
        }
    }
}