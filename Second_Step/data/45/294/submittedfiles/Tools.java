/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void swap(int[]table, int idx1, int idx2){//this method switches 2 given cases of the table
        int temp = table[idx2] ; //stocks the value of table[index2]
        table[idx2] = table[idx1] ; 
        table[idx1] = temp ;
    }
     
    public static int[] sortBubble(int[] tab) {
        boolean notSorted = true ;
        while(notSorted){//change the value of the boolean to go into the following loop
            notSorted = false ;
            for(int i = 0 ; i < tab.length - 1 ; i++){//ton erreur est sur cette ligne...
                if(tab[i] > tab[i+1]){
                    swap(tab, i, i+1) ; //switch the cases i and i+1 thanks to the method swap written before. 
                    //if i and i+1 are already sorted, the if loop is jumped and the boolean is still false
                    notSorted = true ; 
                }
            }
        }
        return tab ;
    }
}