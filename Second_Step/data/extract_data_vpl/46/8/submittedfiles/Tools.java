/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbPaires=0;
        for (int i=0; i<tab.length-1; i++){
            for (int j=i+1; j<tab.length-1; j++){
                if (tab[i]==-tab[j]){
                    nbPaires=nbPaires+1;
                }
             }
        }
        return nbPaires;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        triRapide(tab);
        int nbPaires=0;
        int gauche=0;
        int droite=tab.length-1;
        
        while(droite<gauche){
            if(tab[gauche]+tab[droite]==0){
                nbPaires=nbPaires+1;
                gauche=gauche+1;
                droite=droite-1;
            } else { 
                if (tab[gauche]+tab[droite]<0){
                    gauche=gauche+1;
                }
            else {
                if (tab[gauche]+tab[droite]>0){
                droite=droite-1;
                }
            }
            }
        }
        return nbPaires;
    }

}