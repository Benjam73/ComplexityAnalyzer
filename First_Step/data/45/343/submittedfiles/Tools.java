/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        	boolean trie=false;
		while(!trie){
			trie=true;
			for(int i=0; i<tab.length-1;i++){
				if(tab[i]>tab[i+1]){
					int cas[]={0};
					cas[0]=tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=cas[0];
					trie=false;
				}
			}
		}
		return tab;
    }

}