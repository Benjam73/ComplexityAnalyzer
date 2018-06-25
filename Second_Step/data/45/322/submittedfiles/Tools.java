/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
       boolean c= false;
       int k=0;
       while(!c && k<tab.length-1){
            c=true;
            for ( int i=0;i<tab.length;i++){
                if( tab[i+1]>tab[i]){
                    int b = tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=b;
                    c= false;
                }
            }k++;
       }
       return tab;
    }


}
        


