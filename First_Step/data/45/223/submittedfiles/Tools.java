/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void swap(int[] t, int idx1, int idx2){
        int temp = t[idx1];
        t[idx1] = t[idx2];
        t[idx2] = temp;
    }
     
     
    public static void sortBubble(int[] tab) {
       boolean notsorted = true;
       int n = tab.length;
       int fin = 0;
       while (notsorted){
           notsorted = false;
           for (int i =0; i < n - 1 - fin; i++){
               if (tab[i] > tab[i+1]){
                  swap(tab, i , i+1);
                  notsorted = true;
               }
               
           }
           fin ++ ;
       }
    }

}