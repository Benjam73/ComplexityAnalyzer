/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */ 
    public static int [] sortBubble(int[] tab) {
        int n = tab.length;
        int k = n -1;
        int j = 0;
        boolean tri = false;
        while ((k>0) && (tri = false)){
            tri = true;
            for (int i = 0; i < k; i++){
                if (tab[i]>tab[i+1]){
                    j = tab[i+1];
                    tab [i+1] = tab[i];
                    tab [i] = j;
                    tri = false; 
                }
            }
            k = k-1;
        }
        return tab;
    }
    

}