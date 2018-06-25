/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int[] temp = new int[tab.length];
        while (temp != tab){
            temp = tab;

            for (int i = 0; i < tab.length-1; i++){
                
                if (tab[i] > tab[i+1]){
                 int k    = tab[i];
                 tab[i]   = tab[i+1];
                 tab[i+1] = k;
                }
            }
        }
        return temp;
    }

}