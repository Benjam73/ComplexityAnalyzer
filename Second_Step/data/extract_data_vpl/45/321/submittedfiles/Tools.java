/**
 * A class providing a static method for sorting.
 */
public class Tools {
    	public static void echanger(int []tab, int k, int j){
		int tmp = tab[k];
		tab[k]=tab[j];
		tab[j]=tmp;
    	}

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static  int[] sortBubble(int[] tab) {
       boolean change = true;
       while(change){
           change=false;
           for (int i=0;i<tab.length-1;i++){
               if(tab[i]>tab[i+1]){
                   echanger(tab, i, i+1);
                   change = true;  
           }
       }
    }
}