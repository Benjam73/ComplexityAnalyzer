/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int j=0;
        while(j<tab.length-1){
            for (int i=0; i<tab.length-j-1;i++){
                if(tab[i]>tab[i+1]){
                    int a=tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=a;
                }
            }
            j=j+1;
        }
    return tab;   
        
    }

}