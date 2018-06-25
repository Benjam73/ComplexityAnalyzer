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
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-1;j++) {
                if (tab[j]>tab[j+1]) {
                    echanger(tab, j, j+1);
                }
            }
        } return tab;
    }
    
    public static void echanger(int[] t, int index1, int index2) {
        int temp=t[index1];
        t[index1]=t[index2];
        t[index2]=temp;
    }

}