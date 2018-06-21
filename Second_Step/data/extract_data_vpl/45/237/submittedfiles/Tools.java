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
        for (int i=0; i<tab.length; i++){
            for (int j=0; j<tab.length - 1; j++){
                if (tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]= temp;
                }
            }
        }
    }

}