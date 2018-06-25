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
		//TODO
		Boolean tabEnOrdre = false;
		int taille = tab.length;
		while (!tabEnOrdre){
			tabEnOrdre = true ;
			for(int i = 0; i < taille-1 ; i++){
				if(tab[i]<tab[i+1]){
					echange(tab, i, i+1);
					tabEnOrdre = false;
				}
			}
			taille -- ;
		}
	}
	public static void echange(int[] tab, int i, int j){
		int tmp = tab[i];
		tab[i] = tab[j] ;
		tab[j] = tmp ;
	}

}