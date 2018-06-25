/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbPaire=0;
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    nbPaire=nbPaire+1;
                }
            }
        }
        return nbPaire;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int i=0;
        int nbPaire=0;
        int j=tab.length-1;
        while(i<j){
            if (tab[i]+tab[j]==0){
                nbPaire++;
                i++;
                j--;
            }
            else if(tab[i]+tab[j]>0){
                j--;
            }else{
                i++;
            }
        }
        return nbPaire;
    }

}