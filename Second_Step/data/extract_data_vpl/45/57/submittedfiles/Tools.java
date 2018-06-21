/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table (ascending) given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        //parcourir la table "grande boucle"
        for(int i = 0; i<= tab.length-2; i++) {
            //parcourir et changer deux à deux
            for(int j = tab.length-1; i<j; j--) {
                if(tab[j] < tab[j-1]) {
                    int temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        return tab;
    }

}