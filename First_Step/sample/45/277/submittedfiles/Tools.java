/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int j =0; j<tab.length;j++){
            for (int i =0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    Tools.swap(tab,i,i+1);
                }
            }
        }
        return tab;
    }
    public static void swap(int[] t, int id, int ie){
        int temp = t[id];
        t[id] = t[ie];
        t[ie] = temp;
    }

}