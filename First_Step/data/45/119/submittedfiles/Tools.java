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
        for (int i=0; i<(tab.length-2);i++){
            for (int j=(tab.length-1); i<j;j--){
                if (tab[j]<tab[j-1]){
                    int c=tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=c;
                }
            }
        }
        //TODO  
    }

}