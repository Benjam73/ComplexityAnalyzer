/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean modif = true;
        while(modif){
            modif=false;
            for(int i=0; i<tab.length-1; i++){
                if (tab[i]>tab[i+1]){
                    int k = tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=k;
                    modif=true;
                }
            }
        }
       return tab; 
    }

}