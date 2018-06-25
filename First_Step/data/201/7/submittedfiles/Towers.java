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
    
    public int maxG(int a){
        int m = t[0];
        for (int i = 1; i < a; i++){
            if (t[i] > m ){
                m = t[i];
            }
        }
        return m;
    }
    
    public int maxD(int a){
        int n = t[a];
        for (int i = a + 1; i < t.length; i++){
            if (t[i] > n ){
                n = t[i];
            }
        }
        return n;
    }
    
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int water(){
        int q = 0;
        for(int i = 1; i < t.length - 1; i++){
            q = q + Math.max(0, Math.min(t.maxG(i), t.maxD(i)) - t[i]);
        }
        return q;
    }

 
}