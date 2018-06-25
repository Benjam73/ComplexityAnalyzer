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
        //TODO 
        int n=tab.length;
        int temp;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if(tab[i]>tab[i+1]){
                    temp=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=temp;
            }
        }
    }
    }
}