/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        for(int i=0; i<n;i++){
            for(int k=0;k<n-1;k++){
                if(tab[k]>tab[k+1]){
                    int memoire=tab[k];
                    tab[k]=tab[k+1];
                    tab[k+1]=memoire;
                }
            }
            n--;
            }
        return tab;
    }

}