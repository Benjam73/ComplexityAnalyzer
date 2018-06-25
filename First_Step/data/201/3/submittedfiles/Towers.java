/**
 * A class to represent the set of towers.
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
    
    public int quantite(int [] tab){
        int n = this.t.length;
        int qte = 0;
        for (int i =1; i<n-1; i++){
            int maxD = this.maxDroite(i);
            int maxG = this.maxGauche(i);
            int min = Math.min(maxD,maxG);
            qte=qte+Math.max(0,min-t[i]);
        }
        return qte;
            
    }
    
    private int maxDroite(int i){
        int max = this.t[i];
        int n = this.t.length;
        for (int k = i; k<n; k++){
            if(t[k]>t[i]){
                max=t[k];
            }
        }
        return max;
    }
    
    private int maxGauche(int i){
        int max = this.t[i];
        int n = this.t.length;
        for (int k = 0; k<i; k++){
            if(t[k]>t[i]){
                max=t[k];
            }
        }
        return max;
    }
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int water(){
        //TODO
        int n = this.t.length;
        int qte = 0;
        for (int i =1; i<n-1; i++){
            int maxD = this.maxDroite(i);
            int maxG = this.maxGauche(i);
            int min = Math.min(maxD,maxG);
            qte=qte+Math.max(0,min-t[i]);
        }
        return qte;
    }

 
}