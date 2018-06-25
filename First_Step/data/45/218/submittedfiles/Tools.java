/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    public static void echange(int [] tab, int a, int b){
        int stock=tab[a];
        tab[a]=tab[b];
        tab[b]=stock;
    }

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */

    public static void sortBubble( int[] tab){
        int i = 0;
        boolean dejatrié = false;
        while (!dejatrié) {
            dejatrié = true;
            for (int j = 0; j < tab.length-1-i; j++) {
                if (tab[j] > tab[j+1]) {
                    echange(tab, j, j+1);
                    dejatrié = false;
                }
            }
            i = i + 1;
        }
    }

}