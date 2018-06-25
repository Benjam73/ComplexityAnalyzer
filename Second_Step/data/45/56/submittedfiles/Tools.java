/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.lenght;
        int i = 0;
        boolean dejatrie=false;
        while (i<n-1 && dejatrie=false){
            dejatrie=true;
            for (int j=0; j<n-1-i; i++){
                echanger(tab,j,j+1);
                dejatrie=false;
        }
        i=i+1;
    }

}