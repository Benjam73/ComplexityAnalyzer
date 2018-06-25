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
        int n = tab.length;
        int c= 0;
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                if(tab[j]+tab[i]==0 && tab[i]!=0 && tab[j]!=0){
                    c=c+1;
                    tab[i] = 0;
                    tab [j]= 0;
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
     public static void echanger (int [] tab, int i, int j){
         int temp = tab[i];
         tab[i]=tab[j];
         tab[j]=temp;
     }
     
    public static int fastNumberOfCancellations(int[] tab) {
        int c = 0 ;
        int n = tab.length;
        int i = 0;
        if (tab.length!=0){
            while (i<n-1){
                for (int j = 0 ; j<n-1-i;j++){
                    if (Math.abs(tab[j])> Math.abs(tab[j+1])){
                        echanger(tab,j,j+1);
                    }
            
                }
            i=i+1;
            }
            for (int k=0; k<n-1;k++){
                if(Math.abs(tab[k])==Math.abs(tab[k+1])){
                    c=c+1;
                }
            }
            return c;
        }
        else {
            return c; 
        }

    }

}