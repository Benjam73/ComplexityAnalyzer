/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
     
    public static void echanger(int[] t, int idx1, int idx2){
        int temp = t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    } 
    
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        int i = 0;
        boolean dejaTrie = false;
        
        while (i<n-1 && !dejaTrie){
            for(int j=0 ; j<n-1-i ;j++){

                if(tab[j]>=tab[j+1]){
                    echanger(tab,j,j+1);
                    dejaTrie=false;
                }
            }
            i++;
        }
    return tab;
    }

}