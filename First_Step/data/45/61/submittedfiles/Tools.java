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
        int[] t=new int[1];
        boolean change = true;
        while(i>0 && change){
            change =false;
            for (int j = 0 ; j<i-1; j++){
                if(tab[j]>tab[j+1]){
                    t[0] = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=t[0];
                   change=true;
                }
            }
            i=i-1;  
        }
        return tab;
    }

}