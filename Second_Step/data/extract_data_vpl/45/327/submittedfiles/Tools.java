/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        int i = 0;
        boolean dejatrie = false;
        while (i<n-1 && !dejatrie){
            for(int j=0;j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                    dejatrie=false;
                }
            }
            i=i+1;
        }
       return tab; 
    }
    
    public static void echanger(int[] tab,int i,int j){
        int stock = 0;
        stock=tab[i];
        tab[i]=tab[j];
        tab[j]=stock;
    }

}