/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nb = 0;
        for (int j=0; j<tab.length;j++){
            for (int i=0; i<tab.length-1;i++){
                if((tab[j]+tab[i]) == 0){
                    nb++;
                }
            }
        }
        return nb/2;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        //On trie le tableau
            boolean trie=true;
            while (trie){
                trie=false;
                for (int i=0; i<(tab.length-1);i++){
                    if (tab[i]>tab[i+1]){
                        int temp= tab[i];
                        tab[i]=tab[i+1];
                        tab[i+1]=temp;
                        trie = true;
                    }
                }
            }
        //Decompte des paires
            int a=0;
            int longueur=tab.length-1;
            int nombre = 0 ;
            while (a<longueur){
                if ((tab[a]+tab[longueur])==0){
                    nombre= nombre+1;
                    a++;
                    longueur--;
                }
                else{
                    if (tab[a]+tab[longueur]>0){
                        longueur--;
                    }
                    else{
                        a++;
                    }
                }
            }
        return nombre;
    }
    

}