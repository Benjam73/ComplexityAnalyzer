/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        for (int i=0;i<n-1;i++){
            for (int j=n-1;i<j;j--){
                if (tab[j]<tab[j-1]){
                    echange(tab,j-1,j);
                }
            }
        }
        return tab;
    }
    
    public static void echange(int[] tab,int i,int j){
        int temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }


}