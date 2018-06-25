/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int a=0;
        for(int i=tab.length-1 ;i>=1 ;i=i-1){
            for (int j=0;j<i;j++){
                if(tab[j]>tab[j+1]){
                    a=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=a;
                }
            }
        }
        return tab;
    }

}