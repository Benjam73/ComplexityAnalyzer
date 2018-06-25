public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        //TODO  
        for (int i =0; i<tab.length; i++){
            for (int j =0; j<tab.length-1-i;j++){
                if (tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                    
                }
            }
            
        }
    }

	private static void swap(int[] tab, int j, int i) {
		// TODO Auto-generated method stub
		int temp = tab[i];
		tab[i]=tab[j];
		tab[j]=temp;
		
	}
}