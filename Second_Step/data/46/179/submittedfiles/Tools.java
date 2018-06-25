/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    
        int count1=0;
        int count2=0;
        for (int i=0; i<tab.length; i++ ){
           
            for(int j=0; j<tab.length;j++){
                if(tab[j]==-tab[i]){
                    count2++;
                }
            }
        }
        return (count1+count2/2);
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        
        int count1=0;
        int count2=0;
        for (int i=0; i<tab.length; i++ ){
           
            for(int j=0; j<tab.length;j++){
                if(tab[j]==-tab[i]){
                    count2++;
                }
            }
        }
        return (count1+count2/2);
        
    }

}