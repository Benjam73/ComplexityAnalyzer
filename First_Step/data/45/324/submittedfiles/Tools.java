/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int x=0;
        int i=0;
        int v=1;
        while(v!=0){
            v=0;
            for(int j=0;j<tab.length-i;j=i+1){
                if(tab[i]>tab[i+1]){
                    x=tab[i];
                    v=v+1;
                    tab[i]=tab[i+1];
                    tab[i+1]=x;}
                
                }
            i=i+1;    
                }
        return tab;    
            }
            
        }
        
        
    

