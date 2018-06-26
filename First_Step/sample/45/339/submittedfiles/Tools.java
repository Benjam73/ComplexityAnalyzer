/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
     private int []tab;
    public static int[] sortBubble(int[] tab) {
        int k = 0;
        boolean a = false;
        while (k<tab.length && !a ){
            a = true;
            for (int i=0;i<tab.length-1;i++){
                if(tab[i]>tab[i+1]){
                    int s=tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=s;
                    a =false;
                }
                
            }
            k++;
        }
        return tab;
        
    }
    
}