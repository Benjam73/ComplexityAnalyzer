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
    public int hMoreG(int pos){
        int h=0;
        for (int i=0; i<pos;i++){
            if (this.t[i]>=this.t[h]){
                h=i;
            }
        }
        return h;
    }
    
    public int hMoreD(int pos){
        int h=0;
        for (int i=pos+1; i<this.t.length;i++){
            if (this.t[i]>=this.t[h]){
                h=i;
            }
        }
        return h;
    }
    
    public int water(){
        //TODO
        int q=0;
        for (int i=1;i<=this.t.length-1;i++){
            q=q+(Math.max(0,(Math.min(hMoreD(i),hMoreG(i))-t[i])));
        }
        
        return q;
    }

 
}