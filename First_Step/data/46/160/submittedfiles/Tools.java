/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int compteur = 0;
        for (int i = 0; i < tab.length; i++){
            for (int j = i+1; j < tab.length; j++){
                if (tab[i] == - tab[j]){
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
        int compteur = 0;
        int[] sortTab = new int[tab.length];
        sortTab = triFusion(tab);
        for (int i = 0; i < tab.length; i++) {
            if (estPresent(sortTab, - sortTab[i]) && sortTab[i] < 0) {
                compteur++;
            }
        }
        return compteur;
    }
    
    public static boolean estPresent( int[] tab, int elt){
        int gauche = 0 ;
        int droite = tab.length - 1 ;
        boolean trouve = false ;
        while (gauche <= droite &&!trouve) {
            int milieu = (gauche + droite) / 2 ;
            if (tab[milieu] < elt) {
                gauche = milieu + 1 ;
            } else if (tab[milieu] > elt) {
                droite = milieu - 1 ;
            } else {
                trouve = true ;
            }
        }
        return trouve;
    }
    
    public static int[] cutList(int[] t, int i, int j) {
        int[] cutT = new int[j - i];
        for (int k = 0; k < j - i; k++) {
            cutT[k] = t[k+i];
        }
        return cutT;
    }
    
    public static int[] triFusion( int[] t){
        int n = t.length ;
        if (n > 1) {
            int[] tg=cutList(t,0,n/2) ; //int[] tg=Arrays.copyOfRange(t,0,n/2) ;
            int[] td=cutList(t,n/2,n) ; //int[] td=Arrays.copyOfRange(t,n/2,n) ;
            tg = triFusion(tg) ;
            td = triFusion(td) ;
            return fusion(tg, td);
        } else {
            return t;
        }
    }
    
    public static int[] fusion( int[] t1, int[] t2){
        int n = t1.length + t2.length ;
        int[] tab = new int[n] ;
        int pos1 = 0, pos2 = 0 ;
        for ( int i = 0 ; i < n ; i++) {
            if (pos1<t1.length && (pos2==t2.length || t1[pos1] < t2[pos2])) {
                tab[i] = t1[pos1] ;
                pos1++;
            } else {
                tab[i] = t2[pos2] ;
                pos2++;
            }
        }
        return tab;
    }

}