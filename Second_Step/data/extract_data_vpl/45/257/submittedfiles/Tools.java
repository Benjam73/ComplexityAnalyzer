/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void echanger(int []tab, int i, int j){
        int tmp=tab[i];
        tab[i]=tab[j];
        tab[j]=tmp;
    }
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(tab[i] > tab[j]){
                    echanger(tab,i,j);
                }
            }
        }return tab;
    } 

}