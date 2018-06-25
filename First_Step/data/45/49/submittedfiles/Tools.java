/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    
    
    public static int[] sortBubble(int[] tab) {
        int c=0;
        for (int j=0; j<tab.length-1;j++){
            for(int i =0; i<tab.length-j-1;i++){
                if (tab[i]>tab[i+1]){
                    c=tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=c;
                }
                
            }
            
        }
        return tab;
        
    }
    

}