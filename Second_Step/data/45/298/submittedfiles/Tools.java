/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int count=1;
        while (count!=0){
            count=0;
            for (int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                int val=tab[i+1];
                tab[i+1]=tab[i];
                tab[i]=val;
                count+=1;
                }
            }
        }return tab;
    }

}