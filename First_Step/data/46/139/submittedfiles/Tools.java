import java.util.Arrays;
/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int count=0;
        int temp=0;
        boolean trie = false;
        for(int i=0;i<tab.length;i++){
            tab[i]=Math.abs(tab[i]);
            }
        trie = true; 
        while(!trie){
            for(int i=0;i<tab.length-1;i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1]=tab[i];
                    tab[i]=temp;
                }
            }
        }
        for(int i=0;i<tab.length-1;i=i+2){
            if(tab[i]==tab[i+1]){
                count = count +1;
            }
        }
        return count;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        return 0;
    }

}