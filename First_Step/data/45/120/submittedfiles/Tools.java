/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void echanger(int[]tab,int i,int j){
        int a =tab[i];
        tab[i]=tab[j];
        tab[j]=a;
    }
    public static void sortBubble(int[] tab) {
        int n= tab.length;
        for (int i=0; i<n;i++){
            for(int j=n-1;i<j;j--){
                if(tab[j]<tab[j-1]){
                    echanger(tab,j,j-1);
                }
            }
        }
    }

}