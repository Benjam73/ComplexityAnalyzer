/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int i=0;
        
        while(i<tab.length-1){
            for(int j=0;j<tab.length-1-i;j++){
                if(tab[j]>tab[j+1]){
                    int val=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=val;
                }
            }
            i++;
                
        }
        return tab;
        
    }

}