/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int s = 0;
        for (int i = 0 ; i < tab.length-1 ; i++) {
            for (int j = i+1 ; i < tab.length ; j++) {
                if (tab[i]+tab[j] == 0) {
                    s = s+1;
                }    
            }
        }
        return s;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int s = 0 ;
        boolean bubble = false;
        while (!bubble) {
            bubble = true;
            for (int i = 0 ; i < tab.length - 1 ; i++) {
                if (tab[i] > tab[i+1]) {
                    int a = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;
                    bubble = false;
                }
            }
        }    
        int[] tabclasse = new int[tab.length];
        for (int i = 0 ; i < tab.length ; i++) {
            if (tab[i]<0) {
                tabclasse[i] = -tab[i];
            } else {
                tabclasse[i] = tab[i];
            }
        }
        boolean buble = false;
        while (!buble) {
            bubble = true;
            for (int i = 0 ; i < tab.length - 1 ; i++) {
                if (tab[i] > tab[i+1]) {
                    int a = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;
                    buble = false;
                }
            }
        }    
        for (int i = 0 ; i < tab.length-1 ; i++) {
            if (tabclasse[i] == tabclasse[i+1]) {
                s=s+1;
            }
        }
        return s;
    }

}