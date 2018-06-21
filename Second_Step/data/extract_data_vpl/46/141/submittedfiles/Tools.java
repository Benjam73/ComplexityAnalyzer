/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        
        int max = 1;
        int occ = 0;
        int val = tab[0];
        
        for(int i = 0; i<tab.length; i++){
            for(int j = i; j<tab.length; j++){
                if (-tab[i]==(tab[j])){
                    occ++;
                }
            }
            
        }        
    
    return occ;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int occ=0;
        int negative = 0;
        int positive = 0;
        for(int i = 0; i<tab.length;i++){
            if(tab[i]<0){
                negative=negative+tab[i];
                for(int j=i; j<tab.length; j++){
                    if(tab[j]==-(negative)){
                        occ++;
                    }
                }
            }
        }
        for(int i = 0; i<tab.length;i++){
            if(tab[i]>0){
                positive=positive+tab[i];
                for(int j=i; j<tab.length; j++){
                    if(tab[j]==-(positive)){
                        occ++;
                    }
                }
            }
        }
    return occ;
    }

}