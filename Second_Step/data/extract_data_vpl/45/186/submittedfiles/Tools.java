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
        int trans = 0;
        for (int i = 0; i < tab.length-1; i++){
            for ( int j = 0; j < tab.length-i-1; j++){
                if (tab[j] > tab[j+1]){
                    trans=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=trans;
                }
            }
        }
       
    }

}