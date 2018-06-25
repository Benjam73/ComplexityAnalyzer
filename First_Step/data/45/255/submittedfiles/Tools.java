/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    
    private int[] t;
    
    public Tools(int[] tab){
        this.t = tab;
    }
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
    /*public static void sortBubble(int[] t) {
        for (int i = t.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (t[j+1]<t[j]) {
                    int a = t[j+1];
                    t[j+1] = t[j];
                    t[j] = a;
                }
            }
        }
    }
    */
    public static void sortBubble(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i; j<t.length; j++) {
                if (t[i]>t[j]) {
                    int a = t[i];
                    t[i] = t[j];
                    t[j] = a;
                }
            }
        }
    }
    
    
    

}