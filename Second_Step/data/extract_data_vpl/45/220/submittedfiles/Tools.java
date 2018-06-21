/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */

    public static void sortBubble(int[] tab) {
        int j=0;
        boolean dejatrie=false;
        while(j<tab.length && !dejatrie){
            for(int i=0; i<tab.length;i++){
                if(tab[i]>tab[i+1]){
                    echange(tab,tab[i],tab[i+1]);
                    dejatrie=false;
                }
            }
            j++;
        }
    }

}