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
    public int getMax(){
        int m = this.t[0];
        for (int i = 1; i < this.t.length; i++){
            if (m< this.t[i]){
                m = this.t[i];
            }
        }
        return m;
    }
    public int water(){
        //TODO
        int water = 0;
        for (int i = 0; i<= this.getMax()+1;i++){
            int g = 0;
            int d = this.t.length -1;
            while (this.t[g] <= 0 && g!= d){
                g += 1 ;
            }
            while (this.t[d] <= 0 && d!= g){
                d -= 1 ;
            }
            if (g != d){
                for (int j = g; j< d+1; j++){
                    if (this.t[j]<=0){
                        water += 1;
                    }
                }
            for (int f = 0; f < this.t.length; f++){
                this.t[f] -= 1;
            }
            }
        }
        return water;
    }

 
}