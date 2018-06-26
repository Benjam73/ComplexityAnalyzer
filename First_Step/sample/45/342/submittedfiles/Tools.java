/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean bubble = false;
        while (!bubble) {
            bubble = true;
            for (int i = 0 ; i < tab.length - 1 ; i++) {
                if (tab[i] > tab[i+1]) {
                    int a = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;
                    bubble = false;
                }
            }
        }
        return tab;
    }

}