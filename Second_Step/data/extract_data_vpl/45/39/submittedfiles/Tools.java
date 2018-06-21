/**
 * A class providing a static method for sorting.
 */
public class Tools {

    public static void Echange(int[] tab, int i, int j){
        int x = tab[i];
        tab[i]=tab[j];
        tab[j]= x;
    }
    
    
    
    
    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int x = 0;
        int n = tab.length-1;
        boolean change = true;
        while(n>0 && change){
            change = false; /// it was never set to false...
            for (int j=0; j<n ; j++){
                if(tab[j]>tab[j+1]){
                    //Echange(tab, j, j+1);
                    change = true;
                    x = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]= x;
                    
                }
            }
            n=n-1;       
        }
        return tab; /// look at the signature, it is supposed to return the sorted array (unlike the algorithms of the course).
    }

}