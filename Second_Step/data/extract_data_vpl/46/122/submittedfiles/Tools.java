import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    
    public static int numberOfCancellations(int[] tab) {
        int num = 0;
        int n= tab.length;
        for (int i = 0; i<n; i++){
            for(int j =i; j<n; j++){
                if(tab[i]+tab[j] ==0 && tab[i]!=tab[j]){
                    num ++;
                }
            }
        }
        return num;
    }
       


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        
        int n = tab.length;
        for(int i =0;i<n;i++){
            tab[i]= Math.abs(tab[i]);
        }
        Arrays.sort(tab);
        int num=0;
        for(int i=0;i<n-1;i++){
            if(tab[i]==tab[i+1]){
                num++;
            }
        }
       return num;
    }

}