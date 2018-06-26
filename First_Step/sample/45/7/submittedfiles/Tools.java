/**
 * A class providing a static method for sorting.
 */
public class Tools {
    

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        boolean dejafait = false;
		int i = 0;
		while (i<tab.length-1 && !dejafait){
			for(int j=0;j<tab.length-1-i;j++){
				if (tab[j]>tab[j+1]){
					int j1 = tab[j+1];
					tab[j+1] =tab [j];
					tab [j] = j1;
					dejafait =false;
				}
			}
			i++;
		}
        return tab;
    }

}