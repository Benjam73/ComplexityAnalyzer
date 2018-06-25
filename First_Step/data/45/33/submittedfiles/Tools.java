/**
 * A class providing a static method for sorting.
 */
public class Tools {
    

    

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */

     
    public static int[] sortBubble(int[] tab) {

        int i=tab.length;
        boolean ech=true;
        while (( i>0) && (ech)){
            for (int j=0; j<i-1; j++){
                if (tab[j]>tab[j+1]){
                    int temps=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temps; 
                    ech=true;
                    
                    
                }
            }
            i--;
        }
        return tab;
    }

}