/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int j=0;
        boolean dejatrie=false;
        while (j<tab.length-1 && !dejatrie){
            dejatrie=true;
            for (int i=0;i<tab.length-1;i++){
                if (tab[i]>tab[i+1]){
                    int a=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;
                    dejatrie=false;
                }
            }
            j++;
                
            
        }
        
        
    }

}