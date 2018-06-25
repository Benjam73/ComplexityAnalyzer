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
        int  n=tab.length;
        int s=0;
        int error=0;
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
           
                if (tab[i] == -tab[j]) {
                    s++;
                    error++;
                }
            
        }
    }
    for(int k=0;k<n;k++){
        if(tab[k]==0){
            s--;
            error--;
        }
    }
        
    return (s-(error/2));
        
  }       
        
        

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {

           int  n=tab.length;
        int s=0;
        int error=0;
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
           
                if (tab[i] == -tab[j]) {
                    s++;
                    error++;
                }
            
        }
    }
    for(int k=0;k<n;k++){
        if(tab[k]==0){
            s--;
            error--;
        }
    }
        
    return (s-(error/2));
        
  }       

}