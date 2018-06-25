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
        boolean fini = false ;
        int temp;
        int n = tab.length;
        for (int i=0; i<n-1;i++){
            fini = true;
            for (int j =0; j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    fini = false;
                    temp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
            if (fini = false){
                return;
                
            }
                }
            }
        }
        //TODO  
    }

}