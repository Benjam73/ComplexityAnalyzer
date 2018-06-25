/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int numb=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]==tab[j]){
                numb++;
            }
        }
        return numb/2;
     }

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
       int numb= 0;
       for(int i=0;i<tab.length-1;i++){
           int g=i+1;
           while(tab[g]+tab[i]:=0 && g<tab.length-1){
               g++;
           }
           if(tab[g]==tab[i]){
               numb++;
           }
       }
       return numb;
   }

}