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
        int nbpairs=0;
        for(int i =0; i<tab.length;i++){
            for(int j=0; j<i;j++){ 
                if(tab[i]+tab[j]==0){
                    nbpairs=nbpairs+1;
                }
            }
        }
        return nbpairs;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int n =tab.length;          
        for(int i=0;i<n;i++){
            int min=i;
            for(int k=i+1;k<n;k++){
                if(tab[k]<tab[min]){
                    min=k;
                    int inter= tab[min];
                    tab[min]=i;
                    i=inter;
                         /// la premiere chose est de stocker dans inter la valeur à préserver... 
                                    /// regarde la méthode échanger du cours p61... et compare là avec ton code ici
                }
            }
           
        }
        int first=0;
        int last=tab.length-1;
        int nbpair=0;
        while(tab[first]<0 && tab[last]>0 && first<last){
            if(tab[first]+tab[last]==0){
                nbpair=nbpair+1;
            }
            if(-tab[first]>tab[last]){
                first=first+1;
            }else{
                last=last-1;
            }
        }
        return nbpair;

    }

}