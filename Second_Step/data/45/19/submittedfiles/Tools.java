/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean isSorted = false;
        int i = 0;
        while (i<tab.length-1 && !isSorted){
            isSorted = true;
            for (int j=0;j<tab.length-1-i;j++){
                if (tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                    isSorted = false;
                }
            }
            i++;
        }
        return tab;
    }
    
    public static void swap(int[] tab,int i,int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}