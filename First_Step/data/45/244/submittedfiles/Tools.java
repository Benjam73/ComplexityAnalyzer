/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    
    private int[] tab ;
    
    public Tools (int[] tab) {
        this.tab=tab ;
    }

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        boolean notsorted=true ;
        int n = tab.length ;
        int fin = 0 ;
        while (notsorted) {
            notsorted = false ;
            for (int i=0; i<n-1-fin; i++) {
                if (tab[i]>tab[i+1]) {
                    swap(tab,i,i+1) ;
                    notsorted=true ;
                }
            }
            fin++ ;
        }
    }
    
    public static void swap(int[] t, int a, int b) {
        int temp = t[a];
        t[a]=t[b] ;
        t[b]= temp ;
    }

}