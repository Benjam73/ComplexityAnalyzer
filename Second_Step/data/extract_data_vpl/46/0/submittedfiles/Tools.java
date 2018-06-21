/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum = 0;
        for(int i = 0; i<tab.length; i++){
            for (int j =i+1; j<tab.length; j++){
                if((tab[i]+tab[j]) == 0){
                sum++;
                }
            }
        }
        return sum;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        boolean b = true;
        while (b) {
            b = false;
            for(int i =0; i< tab.length-1; i++){
                if(tab[i] > tab[i+1]){
                    int tmp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = tmp;
                    b = true;
                }
            }
        }
        int sum = 0;
        int i = 0;
        int j = tab.length-1;
            while (i<j) {
                if (tab[i] + tab[j] == 0){
                    sum++;
                    i++;
                    j--;
                    }
                else if (tab[i] + tab[j] <  0){
                    i++;
                    }
                else if (tab[i] + tab[j] >  0){
                    j--;
                }
            }  
        return sum;
    }

}