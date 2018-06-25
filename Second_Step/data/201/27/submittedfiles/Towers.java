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
        int qte =0;
        for (int i =1; i < this.t.length-1 ;i++){
            int maxOnRight= this.maxR(i);
            int maxOnLeft = this.maxL(i);
            int min = Math.min(maxOnRight,maxOnLeft)- t[i];
            qte=qte+Math.max(0,min);
        }
        return qte;
    }
    public int maxR(int i){
        int max = t[i+1];
        for (int j = i+2; j < this.t.length; j++){
            if ( t[j]> max){
                max= t[j];
            }
        }
        return max;
    }
    public int maxL(int i){
        int max = t[i-1];
        for (int j = i-2; j >=0; j--){
            if ( t[j]> max){
                max= t[j];
            }
        }
        return max;
        
    }

 
}