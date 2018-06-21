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
     
    public int maxG(int a){
        int max=0;
        for ( int i=0; i<a;i++){
            if (t[i]>max){
                max=t[i];
            }
        }
        return max;
    }
    
    public int maxD(int a){
        int max=0;
        for ( int i=a; i<t.length-1 ; i++){
            if (t[i]>max){
                max=t[i];
            }
        }
        return max;
    }
    
    public int water(){
        int water=0;
        for (int i=1; i<t.length-1 ; i++){
            int maxG=this.maxG(i);
            int maxD=this.maxD(i);
            water=water+Math.max (Math.min(maxG,maxD)-t[i] , 0);
        }
        return water;
        //TODO
    }

 
}