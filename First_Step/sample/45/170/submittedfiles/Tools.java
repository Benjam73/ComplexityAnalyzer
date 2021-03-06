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
        boolean dejatrie = false;
        int temps;
        int n = tab.length;
        int i = 0;
        while(i<n-1 && !dejatrie){
            dejatrie=true;
            for(int j = 0; j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    dejatrie=false;
                    temps=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temps;
                }
            }
            i=i+1;
        }
    }
}
