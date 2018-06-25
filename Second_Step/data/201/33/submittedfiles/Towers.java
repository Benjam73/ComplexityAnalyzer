/**
 * A class to represent the set of towers.
 * @author hadrien cambazard
 */
public class Towers {

    /**
     * A table of integers to model the towers
    **/
    private int[] t;
    
    /**
     * Constructor of scores 
     ***/
    public Towers(int[] thetowers) {
        this.t = new int[thetowers.length];
        for (int i = 0; i < t.length; i++) {
            this.t[i] = thetowers[i];
        }
    }
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
     public int volumeEntreDeuxTours(int i,int j){ // i et j sont les numéro des tours,,,, je l'ai tésté. elle fonctionne !
         int v = 0 ;
         if (t[i]< t[j] && j==i+1){
             return 0;
         }
         if (t[i]> t[j] && j==i+1){
             return 0;
         }
         for (int k=i; k<j+1;k++){
             v+=t[i]-t[k];
             if ( t[i]>t[j]){
                 v = v- (t[i]-t[j]);
             }
         }
         return v ;
     }
    public int water(){//le défaut de mon idée est que la compléxité est de l'ordre cube, je ne suis pas arrivé à écrire la fonction éxacte, j'ai passé bcp de temps, mais vaut mieux essayer :)
        int v = 0; // volume d'eau total
        int j = 0 ;// pour enregistrer la case où on est arriver après avoir calculer volumeEntreDeuxTours
        for ( int i =0 ; i < t.length ; i ++){
            if ( i == j){//le calcul débutera quand i=j, sinon on ne fait rien
                for( int k = j+1 ; k < t.length ; k++) {// la boucle commence de j 
                    if ( t[i] <= t[k]){
                        v += volumeEntreDeuxTours(i,k);
                        j=k;// on enregistre la case où on est arrivé
                        break ;// on arrête la boucle 
                    }
                }
            }
        }
        return v;
    }

 
}