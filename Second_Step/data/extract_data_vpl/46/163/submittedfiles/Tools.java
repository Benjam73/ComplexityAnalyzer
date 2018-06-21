/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
   
    
    public static int numberOfCancellations(int[] tab) {
        import.java.util.Arrays;
        for (int i=0;i<tab.length;i++){
            tab[i]=math.abs(tab[i]);
        }
        Arrays.sort(tab);
        int count =0;
        for (int i=0; i<tab.length-1; i++){
            if (tab[i]==tab[i+1]){
                count=count+1;
            }
        }
        return count;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays sort(tab);
        int count1=0;
        for (int i=0;i<tab.length;i++){
            if (tab[i]==0){
                count1=count1+1;
        }

    }
    return count1;

}
}