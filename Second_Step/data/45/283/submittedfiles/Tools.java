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
        int p=0;
        for(int i=0;i<n-1;i=i+1){
            for(int j=0;j<n-1;j=j+1){
                if(tab[j+1]<tab[j]){
                    p=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=p;
            }
        }
    }
    return(tab);
}
}