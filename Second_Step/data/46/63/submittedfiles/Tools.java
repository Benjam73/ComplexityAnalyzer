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
        int number = 0;
        int indice = 0;
        for(int k=0 ; k<tab.length; k++) {
            int current = tab[k];
            for(int i=k+1 ; i<tab.length; i++) 
            if(current+tab[i]==0) {
                number++;
            }
        }
        return number;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Tools.sortBubble(tab);
        int number = 0;
        int current = tab[0];
        int indiceCurrent = 0;
        int indice = 0;
        while(current<0 && indiceCurrent<tab.length) {
            while(Math.abs(current)==tab[tab.length-1-indice]) {
                number++;
                indice++;
            }
            indiceCurrent++;
        }
        return number;

    }
    
     public static void sortBubble(int[] tab) {
        //TODO 
    	boolean lTET = false; //lTET = laTableEstTriée.
    	while(lTET == false) {
    		lTET = true;
    		for (int i=0; i<tab.length-1; i++) {
    			if (tab[i] > tab[i+1]) {
    				int temp = tab[i];
    				tab[i] = tab[i+1];
    				tab[i+1] = temp;
    				lTET = false;
    			}
    		}
    	}
    	
    }

}