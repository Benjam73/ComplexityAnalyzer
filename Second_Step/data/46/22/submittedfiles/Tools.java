import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbpairs=0;
        int n=tab.length;
        for(int i=0;i<n;i++){
            if(tab[i]==0){
                    nbpairs=nbpairs-1;
                }
            for(int j=i;j<n;j++){
                if (tab[j]+tab[i]==0){
                    nbpairs=nbpairs+1;
                }
            }
            
        }
        return nbpairs;
        

    }
    
    public static void triFusion(int tableau[])
        {
        int longueur=tableau.length;
        if (longueur>0)
            {
            triFusion(tableau,0,longueur-1);
            }
        }
    
    public int valeurabs(int a){
        if (a>=0){
            return a;
        }
        if (a<0){
            return -a;
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        tab.triFusion();
        int nbrepairs=0;
        int i=0;
        int j=tab.length-1;
        if (tab.length==0){
            return 0;
        }
        while(i<j){
            if(tab[i]+tab[j]==0){
                nbrepairs=nbrepairs+1;
            }
            if(valeurabs(tab[i])<tab[j]){
                i=i+1;
            }
            if(valeurabs(tab[i])>tab[j]){
                j=j-1;
            }
        
        
        }
        return nbrepairs;

    }

}