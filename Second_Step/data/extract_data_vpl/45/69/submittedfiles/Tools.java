/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
     public static void echanger (int[] tab,int indice1,int indice2){
        int transi=tab[indice1];
        tab[indice1]=tab[indice2];
        tab[indice2]=transi;
    } 
    public static int[] sortBubble(int[] tab) {
        int taille = tab.length;
        boolean enOrdre = false ;
        int j = 0;
        while(j<taille-1 && !enOrdre){
            enOrdre = true ;
            for (int i = 0 ; i<taille-1-j ; i++){
                if (tab[i] > tab[i+1]){
                    echanger(tab, i, (i+1));
                    enOrdre = false;
                }
            }
            j++;
        }
        return tab;
           
    }

}


    
