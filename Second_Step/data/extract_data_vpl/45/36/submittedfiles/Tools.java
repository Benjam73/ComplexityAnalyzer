/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
   public static void echange (int[] tab, int indice1, int indice2){
        int transi = tab[indice1];
        tab[indice1]=tab[indice2];
        tab[indice2]=transi;
    }
    
    public static int[] sortBubble(int[] tab) {
        int j = 0;
        boolean enOrdre = false ;
        int n = tab.length;
        while (j<n-1 && !enOrdre){
            enOrdre = true ;
            for (int i = 0; i<n-1-j; i++){
                if (tab[i]>tab[i+1]){
                    echange(tab, i, i+1);
                    enOrdre = false ;
                }
            }
            j++;
        }
        return tab;
    }

}