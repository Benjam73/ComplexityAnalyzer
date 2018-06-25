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
    public int water(){
        int qte = 0;
        
        //parcours de l'ensemble des tours
        for (int i=1; i<this.t.length-1; i++){
            int maxInf= this.t[0];
            int maxSup= this.t[t.length-1];
            //recherche du max inf
            for(int j=0; j<i; j++){
                if (maxInf<this.t[j]){
                    maxInf=this.t[j];
                }
            }
            //recherche du max sup
            for(int k=i+1; k<this.t.length; k++){
                if (maxSup<this.t[k]){
                    maxSup=this.t[k];
                }
            }
            //on prend le plus petit des deux max et on ajoute l'eau à qté
            if ((this.t[i]<maxInf)&&(this.t[i]<maxSup)){
                qte+=Math.min(maxInf-this.t[i], maxSup-this.t[i]);
            }
            
        }
        return qte;
    }
    

 
}