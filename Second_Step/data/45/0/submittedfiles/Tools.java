/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for (int i=0; i<this.tab.lenght; i++){
            for (int j=0; j<this.tab.lenght-i; j++){
                if(this.tab[j]>this.tab[j+1]){
                    this.swap(this.tab, j, j+1);
                }
            }
        }
        return tab;
        
    }
    
    public static void swap(int[] tab, int t1, int t2){
        int t==tab[t1];
        tab[t1]==tab[t2];
        tab[t2]==t;
    }

}