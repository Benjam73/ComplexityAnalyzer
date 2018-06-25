/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void echanger(int [] tab, int a, int b){
        int c=tab[a];
        tab[a]=tab[b];
        tab[b]=tab[c];
        
        
    }

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                }
            }
        }
        
        return tab;
    }
        
    
        
    

}