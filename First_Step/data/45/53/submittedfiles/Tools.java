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
        while(n>0){
            for(int j=0; j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    int tmp=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=tmp;
                }
            }
            n--;
        }
        return(tab);
        
    }

}