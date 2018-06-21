/**
 * A class providing static methods for zero pairs algorithms.
 */
import java.util.Arrays ;

public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n = 0 ;
        int[] t = sortBubble(tab) ;
        for (int i = 0 ; i < t.length -1 ; i ++ ){
            if (t[i]+t[i+1] == 0){
                n ++;
            }
        }
        return n ;    
    }
    
    public static int[] sortBubble(int[] tab) {
	    for (int i=0 ; i<tab.length ; i++){
			for (int j=0 ; j<tab.length-i-1 ; j++){
				if (Math.abs(tab[j])>Math.abs(tab[j+1])){
					swap(tab, j, j+1);
				}
			}
		}
		return tab;
    }
    
    public static void swap(int[] t, int idx1, int idx2){
		int temp = t[idx1];
		t[idx1] = t[idx2] ;
		t[idx2] = temp;
	}


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab) ;
        int i = 0 ;
        int j = tab.length -1 ;
        int sum = 0 ;
        while ( i < j ){
            if ( Math.abs(tab[i]) == Math.abs(tab[j]) ){
                sum ++ ;
                i ++ ;
                j -- ;
            } else if ( tab[i] + tab[j] > 0 ) {
                j -- ;
            } else {
                i ++ ;
            }
        }
        return sum ;
    }

}