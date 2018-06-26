/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n =tab.length;
        for (int k=0; k<n-1; k++){
            for (int i=0; i< n-1-k; i++){
                if (tab[i]>tab[i+1]){
                    int temp= tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=temp;
    
                }
            }
        }
     return tab;   
    }
}
