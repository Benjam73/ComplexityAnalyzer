/**
 * A class providing a static method for sorting.
 */
public class Tools {
    private int[] tab;

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int i=0; i<tab.length-1 ; i++){
            for (int j=i+1; j<tab.length ; j++){
                if (tab[i]>tab[j]){
                    int tps = tab[i];
                    tab[i]=tab[j];
                    tab[j]=tps;
                }
            }
        }
        return tab;
    }
}