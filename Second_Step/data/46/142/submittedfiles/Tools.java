import java.util.Arrays;


/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nb=0;
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    nb++;
                }
            }
        }
        return nb/2;            //i parcourt tout et j aussi donc /2
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int nb= 0;
        int i=0;
        int j= tab.length-1;
        while(i<j){
            if(-tab[i]==tab[j]){
                nb++;
                i++;
                j--;
            }else if(-tab[i]>tab[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return nb;
    }

}