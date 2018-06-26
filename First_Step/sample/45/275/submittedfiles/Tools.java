/**
 * A class providing a static method for sorting.
 */
public class Tools {

   
    public static int[] sortBubble(int[] tab) {
        int x;
        for (int i =0; i<tab.length-1; i++) {
            for ( int j=0; j<tab.length-1; j++) {
                if (tab[j] > tab[j+1]) {
                    x = tab [j];
                    tab[j] = tab[j+1];
                    tab[j+1] = x;
                }
                else {
                    
                }
            }
        }
        
    return(tab);
    }

}