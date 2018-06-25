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
        boolean tabdejatri=false;
        int l = tab.length;
        int i=0;
        while (i<=l-1 && !tabdejatri){
            tabdejatri=true;
            for (int k=0; k<l-1-i; k++){
                if (tab[k]>tab[k+1]){
                    echange(tab, k, k+1);
                    tabdejatri=false;
                }
            }
            i++;
        }
    }
    
    public static void echange(int[]tab, int i1, int i2){
        int temp=tab[i1];
        tab[i1]=tab[i2];
        tab[i2]=temp;
    }

}