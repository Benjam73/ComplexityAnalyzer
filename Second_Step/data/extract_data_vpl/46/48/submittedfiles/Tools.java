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
        int nb=0;
        for(int i=0;i<tab.length;i++){
            // in order to know if we already found a pair with this i (nbi=0 if we did not and 1 if we did)
            int nbi=0;
            int j=i+1;
            while(j<tab.length && nbi==0){
                if(tab[i]+tab[j]==0){
                    nb+=1;
                    nbi=1;
                }else{
                    j+=1;
                }
                
            }
        }
        return nb;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        int i=0;
        int PremierIndicePositif = -1;
        while(i<tab.length && PremierIndicePositif == -1){
            if(tab[i]>=0){
                PremierIndicePositif =i;
            }else{
                i+=1;
            }
        }
        if(PremierIndicePositif == -1 || PremierIndicePositif ==0){
            return 0;
        }else{
             int nb=0;
             int k=PremierIndicePositif;
             int j=PremierIndicePositif-1;
             while(k<tab.length && j>=0){
                if(tab[k]==-tab[j]){
                     nb+=1;
                     k+=1;
                     j-=1;
                 }else{
                     if(tab[j]+tab[k]<0){
                         k+=1;
                     }else{
                         j-=1;
                     }
                      
                 }
        }
        return nb;
        }
       

    }
}
