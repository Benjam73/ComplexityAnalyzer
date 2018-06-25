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
        //int temp;
        //int n = tab.length;
        //for (int i=0; i<n; i++){
        //    while (tab[i]>tab[i+1]){
        //        temp=tab[i];
        //        tab[i]=tab[i+1];
        //        tab[i+1]=temp;
        //    }
        //}
        //System.out.prinln(""tab);
        //TODO  
        int temp;
        int n=tab.length;
        int i=0;
        while (i<n-1){
            for (int j=0; j<n-1; j++){
                if (tab[j]>tab[j+1]){
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
            i+=1;
        }
    }

}