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
        int n = tab.length;
        for (int i =0; i<n-1; i++){
            for (int j=n-1; i<j; j--){
                if (tab[j]<tab[j-1]){
                int val=tab[j-1];
                tab[j-1]=tab[j];
                tab[j]=val;
                }
            }
        }
    }

}