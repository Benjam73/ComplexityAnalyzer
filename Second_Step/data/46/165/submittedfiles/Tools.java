/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    int qu = 0;
        for (int j=0; j<tab.length;j++){
            for (int i=0; i<tab.length-1;i++){
                if((tab[j]+tab[i]) == 0){ qu++;
                }
            }
        }
    return qu/2;
    }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        //Tri du tableau
        boolean change=true;
        while (change){
        change=false;
        for (int h=0; h<(tab.length-1);h++){
            if (tab[h]>tab[h+1]){
                int temp= tab[h];
                tab[h]=tab[h+1];
                tab[h+1]=temp;
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
            }else{if (tab[k]+tab[l]>0){l--;
                }else{k++;}
            }
            }
            return nombre;
            }
    }

}