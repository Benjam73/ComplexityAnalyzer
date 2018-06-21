import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n = tab.length;
        int c = 0;
        for(int i = 0; i < n; i++ ){
            for(int j = n-1; j>=0  ; j--){
                if( tab[i]+tab[j] == 0 ){
                    c++;
                }
            }
        }
        return(c/2);

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * 
     * 
     */
     
    public static int[] fusion(int[] t1, int[] t2){
        int n = t1.length + t2.length;
        int[] tab = new int[n];
        int pos1 =0;
        int pos2 =0;
        for(int i=0; i<n; i++){
            if(pos1 <t1.length && (pos2 == t2.length || t1[pos1] < t2[pos2])){
                tab[i] = t1[pos1];
                pos1++;
            }else{
                tab[i] = t2[pos2];
                pos2++;
            }
        }
    return tab;
    }
        
    public static int[] triFusion(int[] t){
        int n = t.length;
        if (n>1){
            int[] tg = Arrays.copyOfRange(t,0,n/2);
            int[] td = Arrays.copyOfRange(t,n/2,n);
            tg = triFusion(tg);
            td = triFusion(td);
            return fusion(td,tg);
        }else{
            return t;
        }
    }
    public static int fastNumberOfCancellations(int[] tab) {
        return 5;

    }
    

}