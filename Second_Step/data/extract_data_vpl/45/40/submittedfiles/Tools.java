/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void echange( int [] tab, int i, int j){
        int temp = tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }
    public static int [] sortBubble(int []tab){
        int n = tab.length-1;
        boolean change=true;
        while (n>0 && change){
            change = false;
            for(int j=0;j<n;j++){
               if(tab[j]>tab[j+1]){
                echange(tab,j,j+1);
                change = true;
                } 
            }
            n=n-1;
        }
        return tab;
        
    }

}