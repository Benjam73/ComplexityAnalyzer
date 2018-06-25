/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbrPaires=0;
        for(int i =0; i<tab.length;i++){
            for (int j=i+1; j<tab.length;j++){
                if(tab[i]+tab[j]==0){
                    nbrPaires++;
                }
            }
        }
        return nbrPaires;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int first=0;
        int last=tab.length-1;
        int nbrPaire=0;
        while(tab[first]< 0 && tab[last]>0 && first<last){
            if(tab[first]+tab[last] == 0){
                nbrPaire++;
            }
            if(-tab[first]>tab[last]){
            first++;
            }   
            else{ last--;
    }
}
            return nbrPaire;

}
}

