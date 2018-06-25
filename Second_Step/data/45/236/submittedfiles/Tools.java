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
        int n = tab.length;
        int i = 0;
        boolean dejatrie = false;
        while (!dejatrie && i < n){
            dejatrie = true;
            for(int j = 0; j < n-i-1; j++){
                if (tab[j+1] < tab[j]){
                    int a = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = a;
                    dejatrie = false;
                }
            }
            i = i + 1;
        }
    }

}