/**
 * A class providing static methods for zero pairs algorithms.
 */
import java.util.Arrays;
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n=tab.length;
        int nb=0;
        for(int i=0; i<n-1; i++){
            for(int j=i;j<n-1;j++){
               if(tab[j]+tab[i]==0){
                    nb=nb+1;
                }

            }
        }
    return(nb);
   
    }


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int nb1=0;
        int [] tab1 = new int [tab.length];
        for(int i=0; i<tab.length-1; i++){
            tab1[i]= Math.abs(tab[i]);
        }
        Arrays.sort(tab1);
                for(int i=0; i<tab1.length-1;i++){
                    if(tab1[i]-tab1[i+1]==0){
                        nb1=nb1+1;
                    }
                }
    return(nb1);
    }

}