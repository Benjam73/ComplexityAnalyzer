/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int temp;
        for(int i=0; i<tab.length-1; i++){
            for (int j=0;j<tab.length-1-i;j++){
                if (tab[j]>tab[j+1]){
                    temp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
        }
    return tab;   
    }

}