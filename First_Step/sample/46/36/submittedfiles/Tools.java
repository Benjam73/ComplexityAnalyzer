import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int comp = 0;
        for (int i = 0; i<=tab.length-1;i++){
            for (int j = i+1; j<=tab.length-1; j++){
                if (tab[i] == -tab[j]){
                    comp++;
                }
            }
        }
        return comp;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int comp = 0;
        int i = 0;
        int j = tab.length-1;
        while(i<j){
            if (Math.abs(tab[i])<Math.abs(tab[j])){
                j--;
            }else if (Math.abs(tab[i])>Math.abs(tab[j])){
                i++;
            }else{
                i++;
                j--;
                comp++;
            }
        }
        return comp;
    }

}