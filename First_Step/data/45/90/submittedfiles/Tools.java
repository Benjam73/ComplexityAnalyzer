/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int m=0;
        while (m<=tab.length){
            for (int i=1;i<=tab.length-1;i++){
                if (tab[i-1]>tab[i]){
                    int a = tab [i];
                    tab[i] = tab[i-1];
                    tab[i-1] = a;
                }
            }
            m++;
        }
    return tab;
    }

}