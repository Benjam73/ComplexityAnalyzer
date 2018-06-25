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
            for (int j=0;j<tab.length-1;j++){
                int k=0;
                if (tab[j+1]<tab[j]){
                    k=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=k;
                }
            }
        }
        return tab;
        
    }

}