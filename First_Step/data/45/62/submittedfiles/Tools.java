/**
 * A class providing a static method for sorting.
 */
public class Tools {
    public static void echanger(int[]ech, int a, int b){
        int temp = ech[a];
        ech[a]=ech[b];
        ech[b]=temp;
    }

    

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length-1;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                }
            }
        }
        return tab;
    }
}