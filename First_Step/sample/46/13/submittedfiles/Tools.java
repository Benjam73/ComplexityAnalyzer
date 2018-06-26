/**
 * A class providing static methods for zero pairs algorithms.
 */

public class Tools {
	private static void echanger(int[] tab, int i, int j){
		int temp;
		temp = tab[i];
		tab[i] = tab[j];
		tab[j] = temp;	
	}
	
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean trie = false;
        while(!trie){
        	trie = true;
        	for(int i = 0; i < n-1;i++){
        		if(tab[i] > tab[i+1]){
        			echanger(tab,i,i+1);
        			trie = false;
        		}
        	}
        }
        return tab;
    }
    
    public static boolean estPresent(int[] tab, int elt){
    	int gauche = 0;
    	int droite = tab.length - 1;
    	boolean trouve = false;
    	while(gauche <= droite && !trouve){
    		int milieu = (gauche + droite)/2;
    		if(tab[milieu] < elt){
    			gauche = milieu + 1 ;
    		} else if(tab[milieu] > elt){
    			droite = milieu - 1 ;
    		} else {
    			trouve = true;
    		}
    	}
    	return trouve;
    }
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	tab = sortBubble(tab);
    	int k = 0;
    	for(int i = 0; i < tab.length; i++){
    		if(tab[i] <= 0){
    			continue;
    		} else if(estPresent(tab, -tab[i]) ) {
    			k = k + 1;
    		}
    	}
    	
    	return k;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        tab = sortBubble(tab);
    	int k = 0;
    	for(int i = 0; i < tab.length; i++){
    		if(tab[i] <= 0){
    			continue;
    		} else if(estPresent(tab, -tab[i]) ) {
    			k = k + 1;
    		}
    	}
    	
    	return k;
    }

}