/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */    
    public void swap(int[] tab, int i, int j){
        int a=tab[i];
        tab[i]=tab[j];
        tab[j]=a;
        
    }
    public static int[] sortBubble(int[] tab) {
        for (int i=0; i<tab.length; i++){
            for (int j=0; j<tab.length-i-1; j++){
                if (tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                }
            }
        }
        return tab;
        
    }
    


}