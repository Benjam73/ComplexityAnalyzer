/**
 * A class providing a static method for sorting.
 */
public class Tools {
    private int[] tab;
 
    
	

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        int i = 0;
        boolean dejatrie = false;
        
        while(i<n-1 && !dejatrie){
            dejatrie =true;
            for(int j = 0; j< n-1; j++){
                if(tab[j]>tab[j+1]){
                    dejatrie = false;
                    
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
            i = i+1;
        }
       return tab;
    }
    
    //private static void echanger( int[]tab, int i, int j){
    	
    //}

}