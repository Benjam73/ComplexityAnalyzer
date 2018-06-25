/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int sum=0;
        for (int i=0 ; i<tab.length ; i++){
            for (int j=0 ; j<tab.length ; j++){
                if (tab[i]==-tab[j] && i!=j){
                    sum=sum+1;
                }
            }
        }
        return sum/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        // tri le tableau tab dans l'ordre croissant
        boolean change=true;
        while (change){
            change=false;
                for (int i=0; i<(tab.length-1);i++){
                    if (tab[i]>tab[i+1]){
                       int temp= tab[i];
                       tab[i]=tab[i+1];
                       tab[i+1]=temp;
                       change = true;
                    }
                }
        }
        //compte des paires
        int k=0;
        int l=tab.length-1;
        int nombre = 0 ;
        while (k<l){
            if (tab[k]+tab[l]==0){
               nombre= nombre+1;
               k++;
               l--;
            }else{
                if (tab[k]+tab[l]>0){
                   l--;
                }else{
                      k++;
                }
            }
        }
        return nombre;
    }
}