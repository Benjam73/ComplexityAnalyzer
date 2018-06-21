import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {
    private int[]tab;

     /**
      * ON MET PAS DE CONSTRUCTEURS ??? 
      *  JE VOULAIS METTRE CELUI LA 
      * public Tools(int[]t){
        this.tab=new int[t.length];
        for(int i=0;i<t.length;i++){
            this.tab[i]=t[i];
            
     * Give a O(n^2) algorithm for the zero pairs. 
     */        
    public static int numberOfCancellations(int[] tab){
        int nbpairs=0;
        for(int i=0;i<tab.length-1;i++){
            for(int j=i+1;j<tab.length;j++){
                if(tab[i]+tab[j]==0){
                    nbpairs++;
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
        int nbpairs=0;
        int first=0;
        int last=tab.length-1;
        while(tab[first]<0 && tab[last]>0 && first<last){
            if(tab[first]+tab[last]==0){
                nbpairs++;
                first++;
                last--;
            }
            if(-tab[first]>tab[last]){
                first++;
            }else{
                last--;
            }
        }
        return nbpairs;
    }
}