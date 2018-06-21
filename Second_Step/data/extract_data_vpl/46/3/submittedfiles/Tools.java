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
        for(int i=0; i<n; i++){
            for(int g=0; g<n; g++){
                if( tab[i] + tab[g] == 0){
                    somme=somme + 1;
                }
            }
        }
        return somme/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int sum=0;
        int n=tab.length;
        for(int i=0; i<n-1; i++){
            int g = i+1;
            while(tab[g]+tab[i]!=0 && g<n-1){
                g++;
                if(tab[g]+tab[i]==0){
                sum = sum + 1;
                }
            }
        }
        return sum;
    }

}