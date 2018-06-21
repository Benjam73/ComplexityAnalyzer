/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int x = 0 ; 
        for(int i = 0 ; i < tab.length ; i++){
            for(int j = i+1 ; j < tab.length ; j++){
                if(tab[i] + tab[j] == 0){
                    x = x + 1 ;
                }
            }
        }
        return x ; 
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        //first : make positive every case of the tab
        for(int i = 0 ; i < tab.length ; i++){
            if(tab[i] < 0){
                tab[i] = - tab[i] ;
            }
        }
        //bubble sort to sort the cases
        boolean notSorted = true ; 
        int y = 0 ; 
        while(notSorted){
            notSorted = false ; 
            for(int i = 0 ; i < tab.length - 1 ; i++){
                if(tab[i] > tab[i + 1]){
                    int tempo = tab[i] ; 
                    tab[i] = tab[i+1] ; 
                    tab[i+1] = tempo ;
                    notSorted = true ; 
                }
            }
        }
        for(int j = 0 ; j < tab.length - 1 ; j++){
            if(tab[j] == tab[j+1]){
                y = y + 1 ;
            }
        }
        return y ;
    }
}