/**
 * A class providing a static method for sorting.
 */
public class Tools {

	/**
	 * Sort the table given in argument using a bubble sort algoritm,
	 * and returns the sorted table.
	 */
	public static int[] sortBubble(int[] tab) {

		boolean stop = false;
		int courant = 0;

		while(!stop){

			stop = true;
			for (int i =0; i< tab.length-1 ; i++ ){
				if(tab[i+1] < tab[i]){
					courant = tab[i+1];
					tab[i+1]=tab[i];
					tab[i] = courant;
					stop = false;
				}
			}

		}
		
		return tab;

	}

}