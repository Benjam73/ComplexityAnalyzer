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
    public int water(){
        int n = t.length;
        int qty = 0;
        for (int i=0;i<n-1;i++){
            int maxR = this.maxOnR(i);
            int maxL = this.maxOnL(i);
            int min = Math.min(maxR,maxL);
            qty = qty + Math.max(0,min-t[i]);
        }
        return qty;
    }
    
    private int maxOnR(int i){
        int n = t.length;
        int max = t[i];
        for (int k=i;k<n-1;k++){
            if (t[k]>t[i]){
                max = t[k];
            }
        }
        return max;
    }
    
    private int maxOnL(int i){
        int max = t[i];
        for (int k=0;k<i;k++){
            if (t[k]>t[i]){
                max = t[k];
            }
        }
        return max;
    }
}