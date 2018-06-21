/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean dejatrie = false;
        int j = 0;
        while (j < n-1 && dejatrie==false){
            dejatrie = true;
            for (int i = 0 ; i < n-j-1 ; i++) {
                if (tab[i]>tab[i+1]){
                    echanger(tab,i, i+1);
                    dejatrie=false;
                }
            }
               
            j++;
        }
        return tab;
    }
    
    public static void echanger(int[] t,int idx1, int idx2){
        int temp = t[idx1] ; //on stocke l’entier `a l’indice idx1 dans une variable temporaire
        t[idx1] = t[idx2] ; // apr`es cette affection t[idx1] n’est plus pr´esent dans t (d’o`u le besoin de
        t[idx2] = temp ; // la variable temp pour finaliser l’´echange)
    }
}