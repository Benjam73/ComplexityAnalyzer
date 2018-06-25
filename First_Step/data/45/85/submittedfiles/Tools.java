/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
       int n= tab.length;
       boolean dejatrie=false;
       int i=0;
       while (i<n-1 && dejatrie!=true){
           dejatrie = true;
           for (int j=0;j<n-i-1;j++){
               if (tab[j]>tab[j+1]){
                   int mem = tab[j+1];
                   tab[j+1]=tab[j];
                   tab[j]=mem;
                dejatrie = false;
               }
           }
           i++;
       }
       return tab;
    }
    
    
    
    
    
    
    
    
    
    
    
    

}