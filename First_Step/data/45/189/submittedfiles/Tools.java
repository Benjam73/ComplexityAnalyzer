/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    private int[] tab;

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public Tools(int[] tab){
        this.tab = tab;
    }
     
    
    public static void sortBubble(int[] tab) {
        //TODO 
        for(int i=tab.length-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(tab[j+1]<tab[j]){
                    int a = tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=a;
                }
            }
        
        }
    }

}