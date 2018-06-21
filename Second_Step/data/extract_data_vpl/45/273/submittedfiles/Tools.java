/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int change=0;
        for (int i=0; i<tab.length;i++){
                    for (int j=0; j<tab.length-1;j++){
                        if (tab[j]>tab[j+1]){
                        change=tab[j];
                        tab[j]=tab[j+1];
                        tab[j+1]=change;
                        }
        
    }

}
return tab;
}
}