/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        boolean rangee = true;
        int echange;
        while (rangee){
            rangee = false;
            for (int i=0; i<tab.length-1; i++){
                if (tab[i]>tab[i+1]){
                    echange=tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=echange;
                    rangee = true;
                }
            }
        }
    System.out.println(tab);
        //TODO
    }

}