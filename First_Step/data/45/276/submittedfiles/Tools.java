/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean change=true;
        int n=tab.length;
        while(change){
            change=false;
            for (int i=0; i<n-1; i++){
                if(tab[i]>tab[i+1]){
                    int tmp = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]= tmp;
                }
                change=true;
            }
        }
        return tab;
    }

}