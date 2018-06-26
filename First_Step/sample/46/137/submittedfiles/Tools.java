/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int qu = 0;
        for (int j=0; j<tab.length;j++){
            for (int i=0; i<tab.length-1;i++){
                if((tab[j]+tab[i]) == 0){
                    qu++;
                }
            }
        }
        return qu/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        // tri
        int temp = 0;
        boolean change=true;
        while(change){
            change = false;
            for (int i =0; i<(tab.length-1);i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                    change = true;
                }
            }
        }
        int k = 0;
        int nb = 0;
        int l = tab.length-1;
        while(k<l){
            if (tab[k] + tab[l] == 0){
                nb++;
                k++;
                l--;
            }else if(tab[k] + tab[l] > 0){
                l--;
            }else{
                k++;
            }
                }
                return nb;
        }
    }
        
   