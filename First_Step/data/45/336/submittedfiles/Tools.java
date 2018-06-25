/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void echanger( int[] t, int id1, int id2){
        int temp =t[id1];
        t[id1]=t[id2];
        t[id2]=temp;
    }
    public static int[] sortBubble(int[] tab) {
        for (int i=0; i<=tab.length ; i++){
            for ( int j=0; j<=tab.length-2; j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                }
            }
        }
        return tab ;
        
    }

}