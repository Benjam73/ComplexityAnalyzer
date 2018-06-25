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
        boolean tab_en_ordre = false;
        int taille = tab.length;
        while(!tab_en_ordre){
            tab_en_ordre = true;
            for(int i=0 ; i < taille-1 ; i++){
                if(tab[i] > tab[i+1]){
                    swap(tab,i,i+1);
                    tab_en_ordre = false;

                }
            }
            taille--;
        }
    }
    
    public static void swap(int[]tab, int i, int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

}