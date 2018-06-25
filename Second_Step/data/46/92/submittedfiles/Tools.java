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
        int s=0;
        for (int i=0;i<tab.length;i++){
            for (int j=i+1;j<tab.length;j++){
                if (tab[i]==-tab[j]){
                    s++;
                }
            }
        }
        return s;

    }
    public static void sortBubble(int[] tab) {
        //TODO  
        for (int i= tab.length -1;i>= 1; i --){
            for (int j = 0 ; j<=i-1; j ++){
                if (tab[j+1]<tab[j]){
                    int a = tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=a;
                }
            }
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int f = 0;
        int l = tab.length-1;
        int nb = 0;
        for (int i= tab.length -1;i>= 1; i --){ // on trie la liste avant
            for (int j = 0 ; j<=i-1; j ++){
                if (tab[j+1]<tab[j]){
                    int a = tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=a;
                }
            }
        }
        while (tab[f]<0 && tab[l]>0 && f<l || tab[f]>0 && tab[l]<0 && f>l){
            if (tab[f]==-tab[l]){
                nb=nb+1;
            }
            if (-tab[f]>tab[l]){
               f=f+1;
            }else{
                l=l-1;
            }
        }
        return nb;
        

    }

}