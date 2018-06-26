/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    
    public static void echanger(int[] tab, int ind1, int ind2){
        int temp = tab[ind1];
        tab[ind1] = tab [ind2];
        tab [ind2] = temp;
    }

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        //TODO  
        int k = tab.length-1;
        boolean tri = false;
        while (k>0 && !tri ){
            tri = true;
            for (int i =0; i<k; i++){
                if (tab[i]>tab [i+1]){
                    echanger(tab, i,i+1);
                    tri = false;
                }
            }
        k-=1;
        }
    
    }

}