/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     private static void echanger(int[] tab,int i, int j){
         int temp = tab[i];
         tab[i]=tab[j];
         tab[j]= temp;
     }
    public static void sortBubble(int[] tab) {
        //TODO 
        for (int i=0; i< tab.length;i++){
            for (int j=0; j< tab.length-1-i;j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                    
                }
            }
        }
    }

}