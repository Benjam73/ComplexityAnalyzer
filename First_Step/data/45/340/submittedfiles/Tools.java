/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
		int k=0;
		boolean dejatrie=false;
		while (k<tab.length && !dejatrie){
			dejatrie=true;
			for (int i=0; i<tab.length-1; i++){
				if (tab[i]>tab[i+1]){
					int val = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = val;
					dejatrie=false;
				}
			}
			k++;
		}
	return tab;
	}
	
}