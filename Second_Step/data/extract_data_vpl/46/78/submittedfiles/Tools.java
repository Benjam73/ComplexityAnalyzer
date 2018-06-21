/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int numb=0;
        for (int i=0; i<tab.length; i++){
            for (int j=i+1; j<tab.length; j++){
                if (tab[j]+tab[i]==0){
                    numb++;
                }
            }
        }
        return numb;
    }

    
    public static int[] sortBubble(int[] tab) {
		boolean donc = false;
		while (!donc) {
			donc = true;
			for (int i = 0; i < tab.length-1; i++) {
				if (tab[i] > tab[i + 1] ) {
					int temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;
					donc = false;
				}
			}
		}
		return tab;
	}
    
    
    
    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Tools.sortBubble(tab);
        int numb2=0;
        int i=0;
        int j=0;
        int d=tab.length-1;
        while (tab[i]<0 && tab[d-j]>0){
            if (tab[i]+tab[d-j]==0){
                numb2++;
                i++;
                j++;
            }else if (Math.abs(tab[i])<tab[d-j]){
                j++;
            }else if (Math.abs(tab[i])>tab[d-j]){
                i++;
            }
        }
        return numb2;
    }
    
    

}