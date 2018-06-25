/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void echanger(int[]t,int indx1,int indx2){
        int temp =t[indx1];
        t[indx1]=t[indx2];
        t[indx2]=temp;
    }
    public static void sortBubble(int[] tab) {
        boolean dejatrie = false;
        int n = tab.length;
        int i =0;
        while(i<n-1 && !dejatrie){
            dejatrie=true;
            for(int j =0; j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    dejatrie=false;
                    echanger(tab,j,j+1);
                }
            }
            i=i+1;
        }
    }
}