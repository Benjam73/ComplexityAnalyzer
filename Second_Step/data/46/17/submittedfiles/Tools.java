import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n=tab.length;
        int nombre=0;
        for (int i=0; i<n;i++) {
            for (int j=0;j<n;j++) {
                if (tab[i]+tab[j] ==0) nombre+=1;
            }
        }
        return nombre;

    }
    
    public static int[] triFusion(int[] t){
        int n = t.length ;
        if (n > 1) {
            int[] tg=Arrays.copyOfRange(t,0,n/2) ;
            int[] td=Arrays.copyOfRange(t,n/2,n) ;
            tg = triFusion(tg) ;
            td = triFusion(td) ;
            return fusion(tg, td);
        } else {
            return t;
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n=tab.length;
        for (int i=0;i<n;i++) {
            tab[i]=Math.abs(tab[i]);
        
        }
        tab=triFusion(tab); 
        int compteur=0;
        for (int j=0;j<n;j++) {
            if (tab[j]==tab[j+1] ) {
                compteur+=1;
            }
        }
        return compteur;
    }

}