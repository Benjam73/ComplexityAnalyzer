/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algorithm,
      * and returns the sorted table.
     */
    public static void echanger(int[]tableau, int index1, int index2){
        int temp = tableau[index1];
        tableau[index1] = tableau[index2];
        tableau[index2] = temp;
    } 
     
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1 ; i++){
            int min = i;
            for (int k = i+1; k < n; k++){
                if(tab[k] < tab[min]){
                    min = k;
                }
            }
            echanger(tab, min, i);
        }
        return tab;
    }
    
    public int[] tableauRange(int[] tab){
        int[] tableau = new int[tab.length];
        tableau = sortBubble(tab);
        return tableau;
    }

}