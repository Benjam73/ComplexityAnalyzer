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
        int n = t.length;
        int qte = 0;
        for (int i =1 ; i< n-1 ; i++){
            int maxOnR=this.maxRight(i);
            int maxOnL=this.maxLeft(i);
            int min = Math.min(maxOnR,maxOnL)-this.t[i];
            qte += Math.max(0,min);
        }
        return qte;
    }
    
    public int maxLeft (int i){
        int max=t[0];
        for (int k=1 ; k<i ; k++){
            if (t[k]>max){
                max=t[k];
            }
        }
        return max;
    }
    
    public int maxRight (int i){
        int max=t[i+1];
        for (int k=i+2 ; k<t.length ; k++){
            if (t[k]>max){
                max=t[k];
            }
        }
        return max;
    }
 
}