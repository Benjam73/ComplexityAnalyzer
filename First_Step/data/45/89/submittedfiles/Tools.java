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
        int i=0;
        while(i<n-1){
            for(int j=0;j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    int a=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=a;
                }
            }
            i=i+1;
        }
        return tab;
    }
}