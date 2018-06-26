/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int[] sortTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            sortTab[i] = tab[i];
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j=0; j < tab.length - 1; j++){
                if (sortTab[j] > sortTab[j+1]){ //du coup tu dois vérifier sortTab pas tab ! //corrigée
                    Tools.swap(sortTab,j,j+1);
                }
            }
        }
        return sortTab;
    }
    
    
    public static void swap(int[] tab, int i, int j){
        int save = tab[j];
        tab[j] = tab[i];
        tab[i] = save; //attention tu as une erreur ici //corrigée
    }

}