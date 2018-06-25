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
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int maxOnL(int i){
        int ml = 0;
        for (int j = 0; j < i; j++){
            if (t[j] > ml){
                ml = t[j];
            }
        } return ml;
    }
    
    public int maxOnR(int i){
        int mr = 0;
        for (int j = i; j < t.length; j++){
            if (t[j] > mr){
                mr = t[j];
            }
        }return mr;
    }
    
    public int water(){
        int n = t.length;
        int qte = 0;
        for (int i = 1; i < n-1; i++){
            int maxR = this.maxOnR(i);
            int maxL = this.maxOnL(i);
            int min = Math.min(maxR, maxL);
            qte += Math.max(0, min-t[i]);
        }
        return qte;
    }

 
}