/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        boolean echange=true;
        while((n>0) && (echange==true)){
            echange=false;
            for (int k=0;k<n-1;k++){
                if(tab[k]>tab[k+1]){
                    int temp=tab[k];
                    tab[k]=tab[k+1];
                    tab[k+1]=temp;
                    echange=true;
                }
            }
            n--;
        }
    return tab;
    }

}