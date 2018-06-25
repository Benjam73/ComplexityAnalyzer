/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean notSorted=true;
        while(notSorted){
            notSorted=false;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    swap(tab, i, i+1);
                    notSorted=true;
                }
            }
        }
        return tab;
    }
    
    public static void swap(int[]t, int idx1, int idx2){
        int temp=t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    }

}