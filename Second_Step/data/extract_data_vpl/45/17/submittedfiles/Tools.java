/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
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

}