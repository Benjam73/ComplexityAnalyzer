/*
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean change = true;
        while (n>0 && change){
            change = false;
            int tmp = 0;
            for (int i=0; i<n-1;i++){
                if (tab[i]>tab[i+1]){
                        tmp = tab[i];
                        tab[i] = tab[i+1];
                        tab[i+1] = tmp;
                        change = true;
                }
               
            }
            n=n-1;
        }
        return tab;
    }
}
