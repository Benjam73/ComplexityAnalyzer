/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int longueur = tab.length ;
        boolean nonFini;
        do{
            nonFini = false;
            for(int i = 0 ; i < longueur-1; ++i){
                if(tab[i] > tab[i+1]){
                    int tmp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = tmp;
                    nonFini = true;
                }
            }
        }while(nonFini);
        return tab;
    }

}