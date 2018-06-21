
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void sortBubble(int[] tab) {
        int k=0 ; 
		for (int j=0;j<tab.length;j++){
			for (int i=0;i<tab.length-1;i++){
				if(tab[i]>tab[i+1]){
					k=tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=k;
				}
			}
		}
    }}
        