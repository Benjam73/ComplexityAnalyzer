/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for(int i = 0; i< this.tab.length; i++){
            for(int j = 0; j < this.tab.length -1-i; j++){
                if(this.tab[j]>this.tab[j+1]){
                    this.swap(this.tab[],j,j+1);
                    }
                }
            } return tab;
        }
    }