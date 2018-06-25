/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean m=false;
        while(m==false){
        int n = tab.length;
        for(int i=0; i<n-1; i++){
            if(tab[i]>tab[i+1]){
                echanger(tab,i,i++);
                m=false;
            }
        }
    }

}
}