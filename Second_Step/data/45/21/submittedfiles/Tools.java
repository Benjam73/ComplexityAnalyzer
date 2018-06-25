/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int i = 0 ; i < tab.length ; i++){
            int cont = 0 ;
            for (int j = 0 ; j < tab.length - i - 1 ; j++){
                if (tab[j+1] < tab[j]){
                    int a = tab [j] ;
                    tab[j] = tab[j+1] ;
                    tab[j+1] = a ;
                    cont ++ ;
                }
            }
            if (cont == 0) {
                break ;
            }    
        }
        return tab ;
    }

}

