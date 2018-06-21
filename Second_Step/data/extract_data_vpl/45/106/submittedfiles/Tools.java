/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean modifie=false;
        while(!modifie){
            modifie=true;
            int length=tab.length;
            for(int i=0;i<length-1;i++){
                if(tab[i]>tab[i+1]){
                    int var=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=var;
                    modifie=false;
                }
            }
            length--;
        }
        return tab;
    }
}

