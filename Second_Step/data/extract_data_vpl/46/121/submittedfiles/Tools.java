import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int somme=0;
        int n=tab.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(tab[i]+tab[j]==0){
                    somme++ ;
                }
            }
        } return somme;
     
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int i=0;
        int nbrpaires=0;
        int j=tab.length-1;
        while(i<j){
            if(tab[i]+tab[j]==0){
                nbrpaires++ ;
                i++ ;
                j-- ;
            } else if(tab[i]+tab[j] >0){
                j-- ;
            } else{
                i++ ;
            }
        } return nbrpaires;

    }

}