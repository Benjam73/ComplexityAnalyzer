import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compt = 0;
        for (int i=0;i<tab.length;i++){
            for (int j=i+1;j<tab.length;j++){
                if (tab[i]+tab[j]==0){
                    compt++;
                }
            }
        }
        return compt;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int compt = 0;
        for (int i=0;i<tab.length;i++){
            if (estPresent(tab,-tab[i])){
                compt++;
            }
        }
        return compt/2;
    }
    
    public static boolean estPresent(int[] tab,int elt){
        int a = 0;
        int b = tab.length-1;
        boolean trouve = false;
        while (a<=b && !trouve){
            int m = (a+b)/2;
            if (tab[m]<elt){
                a=m+1;
            }
            else if (tab[m]>elt){
                b=m-1;
            }
            else{
                trouve = true;
            }
        }
        return trouve;
    }

}