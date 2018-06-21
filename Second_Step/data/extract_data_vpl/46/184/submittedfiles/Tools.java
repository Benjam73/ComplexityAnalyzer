/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compteur =0;
        int[]tab2=tab;
        for(int i=0;i<tab.length;i++){
            for(int j=i+1;j<tab.length;j++){
                if(tab[i]+tab[j]==0){
                    compteur++;
                }
            }
        }
        return compteur;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
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

           int k=0;
            int l=tab.length-1;
            int nombre = 0 ;
            while (k<l){
               if (tab[k]+tab[l]==0){
   		nombre= nombre+1;
                  k++;
              l--;
           }
               else{
                 if (tab[k]+tab[l]>0){
                   l--;
               }
                else{
                    k++;
                 }
           }
         }
          return nombre;

    }
    
}

    