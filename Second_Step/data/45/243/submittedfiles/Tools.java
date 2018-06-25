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
        //TODO  
        for (int i=0; i<tab.length; i++){
            for(int k=0; k<tab.length-1;k++){
                if (tab[k]>tab[k+1]){
                    int temp=tab[k+1];
                    tab[k+1]=tab[k];
                    tab[k]=temp;
                }
            }
        }
    }

}