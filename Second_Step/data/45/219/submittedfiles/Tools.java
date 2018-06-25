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
        int n = tab.length ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<(n-i-1); j++){
                if (tab[j]>tab[(j+1)]){
                    //System.out.println("échange : "+i+" :");
                    //System.out.println(""+tab[j]+" et "+tab[j+1]);
                    swap(tab,j,(j+1));
                    //System.out.println(""+tab[j]+" et "+tab[j+1]);
                }
            }
        }
    }
    public static void swap(int[] tab,int idx1, int idx2){
        int temp = tab[idx1];
        tab[idx1] = tab[idx2];
        tab[idx2] = temp;
    }
    public static void toString(int[] tab){
        System.out.print("{");
        for (int i=0 ; i<tab.length ; i++){
            System.out.print(" "+tab[i]+" ");
        }
        System.out.println("}");
    }
}