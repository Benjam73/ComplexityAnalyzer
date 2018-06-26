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
        for (int i=tab.length-1; i>=0; i--) {
            for (int j=0; j<i; j++) {
                if (tab[j+1]<tab[j]) {
                    int prov=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=prov;
                }
            }
        }
    }

}