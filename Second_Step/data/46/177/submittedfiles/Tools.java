/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int c=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j< tab.length;j++){
                if(tab[i]+tab[j]==0){
                c++;
                tab[i]=1004540450540450454508+2*i;
                tab[j]=1548948+2*j;
                }
            }
        }
        return c;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
return 1;
    }

}