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
            for(int j=0;j<tab.length-1;j++){
                if(tab[j]>tab[j+1]){
                    int b=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=b;
                }
            }
        }
        return tab;
    }

}