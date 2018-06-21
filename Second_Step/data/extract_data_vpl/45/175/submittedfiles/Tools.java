/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

	/**private int[]tableau;

	public Tools(int []tabl) {
		this.tableau=new int [tabl.length];
		for (int i=0;i<tabl.length;i++) {
			this.tableau[i]=tabl[i];
		}
	}
	/**
	 * Sort the array given in argument in increasing order using a bubble sort algoritm
	 * @param tab: the array to sort
	 */
	 
	 //METHODE DE TRIE DU PLUS PETIT AU PLUS GRAND ex : au départ : [2, 65, 17, 13, 24, 50] > a la fin [2,13,17,24,50,65]
	public static void sortBubble(int[] tab) {

		boolean dejaTrie=true;
		int n=0;
		while ((n<tab.length)&&(dejaTrie)) {
			dejaTrie=false;
			for (int i=0;i<tab.length-1;i++) {
				if (tab[i]>tab[i+1]) {
					int a=tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=a;
					dejaTrie=true;
					
				}
			}
			n++;
		}
		
		//J'affiche le nouveau tableau
		System.out.println("le nouveau tableau est : ");
		for (int i=0;i<tab.length;i++) {
			System.out.print(tab[i]);
			System.out.print("-");
		}
		
	} 



}