/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
  
    
    public static int[] sortBubble(int[] tab) {
        int i= tab.length;
        int temp;
        boolean ech= true;
        while(i>0 && ech == true){
            ech= false;
            for (int j=0 ; j< (i-1); j++){
                
                if(tab[j]>tab[j+1]){
                    ech=true;
                    temp = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
            i--;
        }
        return tab;
        
    }
    

}