/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbPaire = 0;
        
        for (int i = 0; i < tab.length -1; i++){
            for(int j = i+1; j < tab.length;j++){
                if (tab[i] + tab[j] == 0){
                    nbPaire +=1;
                }
            }
        }
        return nbPaire;
    }


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
 /*       tri(tab);                   // En supposant que tri soit une methode connu qui trie le tableau en O(nlog(n)
 *       int i =0;
 *       int j = tab.length -1;
 *       int nbPaire = 0;
 *       while(i<j){
 *           if (tab[i] + tab[j] == 0){
 *               nbPaire += 1;
 *           }
 *           i +=1;
 *           j+=1;
 *       }
 *   }
*/
int nbPaire = 0;
        
        for (int i = 0; i < tab.length -1; i++){
            for(int j = i+1; j < tab.length;j++){
                if (tab[i] + tab[j] == 0){
                    nbPaire +=1;
                }
            }
        }
return nbPaire;
}
}