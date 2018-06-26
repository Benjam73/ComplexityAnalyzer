/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        
        boolean dejatrie=false;
        if (tab.length<=1) {
            dejatrie=true;
        }
        
        while (dejatrie==false) {
            dejatrie=true;
            for (int i=1;i<tab.length;i++) {
                if (tab[i]<tab[i-1]) {
                    echange(tab,i,i-1);
                    dejatrie=false;
                }
            
            }
            
        }
            
    }
    
    public static void echange(int []t,int i,int j){
        int ech=t[i];
        t[i]=t[j];
        t[j]=ech;
    }

}