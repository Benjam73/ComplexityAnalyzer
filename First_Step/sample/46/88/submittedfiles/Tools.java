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
        int n=tab.length;
        int compteur=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=j && tab[j]==-tab[i]){
                    compteur++;
                }
            }
        }
        return compteur;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n =tab.length;
        int premier=0;
        int dernier=n-1;
        int compteur=0;
        Arrays.sort(tab);
        while (tab[premier]<0 && tab[dernier] >0 && tab[premier] < tab[dernier]){
            if(tab[premier]==-tab[dernier]){
                compteur++;
            }if(-tab[premier] > tab[dernier]){
                premier++;
            }else{
                dernier--;
            }
        }
        return compteur;
    }

}