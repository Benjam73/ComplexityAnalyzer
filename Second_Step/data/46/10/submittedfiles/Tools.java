/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int cmpt = 0;
    for(int i = 0; i<tab.length; i++){
        for (int j =i+1; j<tab.length; j++){
            if((tab[i]+tab[j]) == 0){
                cmpt++;
            }
        }
    }
    return cmpt;
    }
    
    /**
     * Bubble Sorting method, but the complexity is O(n²), we need a sorting method of a O(nlog(n)) complexity
     */
    public static void sort(int[] v){
        boolean notSorted = true;
        while(notSorted){
            notSorted = false;
            for(int i =0; i< v.length-1; i++){
                if(v[i] > v[i+1]){
                    int tmp = v[i];
                    v[i] = v[i+1];
                    v[i+1] = tmp;
                    notSorted = true;
                }
            }
        }
    }
    
    





    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        sort(tab);
        
        int cmpt = 0;
        int i = 0;
        int j = tab.length-1;
        
        while(i < j){
            if      (tab[i] + tab[j] == 0){
             cmpt++;
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
    return cmpt;
    }

}