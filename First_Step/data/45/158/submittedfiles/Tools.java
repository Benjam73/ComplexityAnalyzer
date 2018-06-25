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
        int temp= tab[0];
        for (int j=0; j<tab.length-1;j++ ){
        for(int i=0; i<tab.length-j-1;i++){
            if(tab[i]>tab[i+1]){
                temp=tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=temp;
            }
        }}
        
        //TODO  
    }

}