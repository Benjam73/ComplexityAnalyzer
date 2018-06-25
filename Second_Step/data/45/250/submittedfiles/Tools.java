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
        for (int i =0;i<tab.length;i++){
            for (int j = i; j<tab.length;j++){
                if (tab[i]>tab[j]){
                    int tmp = tab[j];
                    tab[j]=tab[i];
                    tab[i]=tmp;
                }
                // for (int k=0;k<tab.length;k++){
                //     System.out.print(tab[k]);
                // }
                //System.out.print("   ");
            }
            
            //System.out.println("");
            
        }

    }

}
