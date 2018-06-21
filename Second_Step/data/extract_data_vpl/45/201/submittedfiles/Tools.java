/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    int[] tab;

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public Tools(int[] tab){
        this.tab = tab;
    }
    public static void echange(int[] tab, int i, int j){ //méthode basique pour echanger 2 elements
        int a = tab[i];
        tab[i] = tab[j];
        tab[j] = a ;
    }
    
    public static void sortBubble(int[] tab) { //tri par ordre croissant en échangeant élément adjacent
        boolean dejatrie = false ; //pour pouvoir arrêter l'algo
        int j = 0 ;
        while( j<tab.length && !dejatrie){//on test si le tableau est déjà trié
            dejatrie = true ; 
            for (int i = 0 ; i<tab.length-1 ; i++){
                if (tab[i] > tab[i+1]){
                    echange(tab,i,i+1);
                    dejatrie = false ;
                }
            }
            j++;
        }
    }

}