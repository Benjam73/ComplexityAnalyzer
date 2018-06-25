/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
	
	public static void echanger(int[] tab, int i, int j){
		int temp= tab[i];
		tab[i]=tab[j];
		tab[j]=temp;
	}
	
	
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
    	int n= tab.length;
        for(int i=n-1; i>0; i-- ){
        	for( int j=i-1;j>=0; j--){
        		if (tab[i]<tab[j]){
        			echanger(tab,i,j);
        		}
        	}
        }
    }

}