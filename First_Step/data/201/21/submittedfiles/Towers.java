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
        int a=0;
        for (int k=0;k<t.length;k++){
            a=a+this.t[k];
        }
        return a;
    }

 
}