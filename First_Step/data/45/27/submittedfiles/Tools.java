/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
       int i = tab.length;
        boolean echange= true;
        while(i>0 && echange==true){
            echange=false;
            for (int j=0;j<i-1;j++){
                int a = tab[j];
                if(tab[j]>tab[j+1]){
                    tab[j]=tab[j+1];
                    tab[j+1]=a;
                    echange = true;
                }
            }
            i--;
        }
        return tab;
    }
    
}