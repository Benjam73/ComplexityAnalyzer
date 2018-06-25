/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void echange(int[] tab, int i, int j){
        int e = tab[i];
        tab[i] = tab[j];
        tab[j] = e;
    }
    public static void sortBubble(int[] tab) {
        //TODO  
        for (int i = 0; i<tab.length; i++){
            for (int j = 0 ; j <tab.length; j++){
                if (tab[j]>tab[i]){
                    echange(tab, i , j);
                }
            }
        }
        
    }

}