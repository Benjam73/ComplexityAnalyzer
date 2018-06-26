/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void echanger (int[] tab , int idx1 , int idx2){
        int temp=tab[idx1] ;
        tab[idx1] = tab[idx2] ;
        tab[idx2]=temp ;
    }

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int i=tab.length ;
        boolean ech = true ;
        while (i>0 && ech == true){
            ech = false ;
            for (int j=0 ; j<i-1 ; j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab , j , j+1) ;
                    ech = true ; 
                }
            }
            i-- ;
        }
        return tab ;
    }
}