public class Tools {

	public static int[] sortBubble(int[] tab) {

		int k=0 ; 

		for (int j=0;j<tab.length-1;j++){
			for (int i=0;i<tab.length-1;i++){
				if(tab[i]>tab[i+1]){

					k=tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=k;

				}
			}
		}
		return tab;
	}
}