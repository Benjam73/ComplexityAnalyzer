/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int i=0;i<tab.length-1;i++){
            for (int j=tab.length-1;i<j;j--){
                if (tab[j-1]>tab[j]){
                    int x=tab[j];
                    tab[j]=tab[j-1];
                    tab[j-1]=x;
                }
            }
        }
    return tab;
    }

}