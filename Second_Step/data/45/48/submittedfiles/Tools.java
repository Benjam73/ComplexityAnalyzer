/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
     
        
        int temporaire =0;
        int n = tab.length;
        
        for (int i=n-1; i>=0; i--){
            for (int j =1; j<=i; j++){
                if (tab[j-1]>tab[j]){
                    temporaire = tab[j];
                    tab[j]=tab[j-1];
                    tab[j-1]=temporaire;
                }
            }
        }
        return tab;
                    
                
        
    }
                
    
    
}


  
