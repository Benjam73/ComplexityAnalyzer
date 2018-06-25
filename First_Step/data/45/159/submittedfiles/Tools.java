/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    
    
    public static void echanger(int[] tab,int k,int l){
        int j=0;
        j=tab[k];
        tab[k]=tab[l];
        tab[l]=j;
    }

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n = tab.length;
        int i = 0;
        boolean dejatrie = false;
        while (i < n-1 && !dejatrie) {
            dejatrie = true;
            for ( int j = 0; j < n-1-i; j++) {
                if (tab[j] > tab[j+1]) {
                    echanger(tab, j, j+1);
                    dejatrie = false;
                    
                }
            }i = i + 1;
        }
    }
     
        //TODO  
    }

