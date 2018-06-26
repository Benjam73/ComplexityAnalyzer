/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int numbcanc = 0;
        for(int i=0; i<tab.length-1; i++){
            for(int j=i; j<tab.length-1; j++){
                if(tab[i] == -tab[j]){
                    numbcanc += 1;
                }
            }
        } return numbcanc;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
       for (int i = 0 ; i<=(tab.length-2) ;i++){
            for (int j = (tab.length-1); i < j; j--){
                if (tab[j] < tab[j-1]){
                    int x = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = x;
                }
            }
        }
        int min=0;
        int max= tab.length-1;
        int nbpaires=0;
        while(min<max){
            if(tab[min]+tab[max] == 0){
                nbpaires ++;
                min++;
                max--;
            }
        else if(tab[min]+tab[max] >0){
            max--;
        }
        else{
            min++;
        }
        }
        return nbpaires;
    }

}