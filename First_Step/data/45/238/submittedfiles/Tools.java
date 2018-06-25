/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public void echange(int[] tab, int i, int j){
        int a=tab[j];
        tab[j]=tab[i];
        tab[i]=a;
    }
    public static void sortBubble(int[] tab) {
        for(int i=0;i<=tab.length-1;i++){
            for(int j=i+1;j<=tab.length-1;j++){
                if(tab[i]>tab[j]){
                    echange(tab,i,j);
                }
            }
        }
    }


}