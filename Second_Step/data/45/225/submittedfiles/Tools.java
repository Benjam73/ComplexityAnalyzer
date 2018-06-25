/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

 
	  /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    private static void echanger( int[]tab, int i, int j) {
    	int temp = tab[i];
    	tab[i]=tab[j];
    	tab[j]=temp;
    }
	
	public static void sortBubble(int[] tab) {
        boolean en_ordre = false;
        int taille = tab.length;
        while(!en_ordre) {
        	en_ordre=true;
        	for (int i=0; i< taille-1 ; i++) {
        		if (tab[i]>tab[i+1]) {
        			echanger(tab,i,i+1);
        			en_ordre=false;
        		}
        	}
        	taille--;
        }
    }
	
	


}