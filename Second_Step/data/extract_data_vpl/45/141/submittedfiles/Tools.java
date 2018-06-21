/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    private int[] tab;
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n = tab.length;
        for(int i=0;i<n;i++){
            for(int k=0;k<n-1-i;k++){
                if(tab[k]>tab[k+1]){
                    int d = tab[k];
                    tab[k]=tab[k+1];
                    tab[k+1]=d;
                }
            }
        }
    }
}