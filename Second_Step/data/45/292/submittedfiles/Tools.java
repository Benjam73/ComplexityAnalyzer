/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        int c = 0;
        boolean a = true;
        while(a){
            int b = 0;
            for(int i = 0; i<n-1 ; i++){
                if (tab[i]>tab[i+1]){
                    b=b+1;
                    c = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = c;
                }
            }
            a = b!=0;
        }
        return tab;
    }
}