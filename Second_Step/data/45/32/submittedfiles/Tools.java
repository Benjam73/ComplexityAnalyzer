/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void echange(int[] tab, int ind1, int ind2){
        int trans = tab[ind1];
        tab[ind1]=tab[ind2];
        tab[ind2]= trans;
    }
    
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        int j = 0;
        boolean enOrdre = false ;
        while(j<n-1 && !enOrdre){
            enOrdre = true;
            for(int i =0; i<n-1-j; i++){
                if(tab[i]>tab[i+1]){
                    echange(tab, i, i+1);
                    enOrdre = false ;
                }
            }
            j++;
        }
        return tab;
    }

}