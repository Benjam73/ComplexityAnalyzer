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
        int exchange = 0;
        int i = 0;
        while (i <= n-2){
            if (tab[i] > tab[i+1]){
                exchange ++;
                int min = tab[i+1];
                tab[i+1] = tab[i];
                tab[i] = min;
            }
            
            i++;
            
            if (i == n-1 && exchange != 0){
                i = 0;
                exchange = 0;
            }
        }
    }

}