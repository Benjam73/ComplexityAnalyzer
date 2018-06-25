import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int c = 0;
        for(int k=0; k<tab.length; k++){
            for(int i=tab.length-1; i>k; i--){
                if(tab[k]+tab[i]==0){
                    c++;
                    System.out.println(tab[k]+" + "+tab[i] + " =0");
                }
            }
        }
        return c;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int e=0;
        int p=0;
        int n=0;
        for(int k=0; k<tab.length; k++){
            if(tab[k]<0){
                n++;
            }else{
                p++;
            }
        }
        System.out.println("p ="+p+", n ="+n);
        int[]pos = new int[p];
        int[]neg = new int[n];
        int c=0;
        int d=0;
        for(int k=0; k<tab.length; k++){
            if(tab[k]<0){
                neg[c]=tab[k];
                c++;
            }else{
                pos[d]=tab[k];
                d++;
            }
        }
        
        for(int a=0; a<p; a++){
            for(int b=0; b<n; b++){
                if(pos[a]==-neg[b]){
                    e++;
                }
            }
        }
        return e;

    }

}