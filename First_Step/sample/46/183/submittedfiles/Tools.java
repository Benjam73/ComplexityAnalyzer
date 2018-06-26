/**
 * A class providing static methods for zero pairs algorithms.
 */
import java.util.Arrays;
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int number = 0;
        for(int i=0;i<tab.length;i++){
            for(int j=i+1;j<tab.length;j++){
                int sum = 0;
                sum=tab[i]+tab[j];
                if(sum==0){
                    number=number+1;
                }
                
            }
        }
        return number;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int left=0;
        int right=tab.length-1;
        int number=0;
        while(tab[left]<tab[right]){
            if(tab[left]==-tab[right]){
                left=left+1;
                right=right-1;
                number=number+1;
            }
            else if(tab[left]+tab[right]>0){
                right=right-1;
            }
            else {
                left=left+1;
            }
        }
        return number;
    }

}