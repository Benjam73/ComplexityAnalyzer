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
        //TODO
        int[] lefthigh = new int[t.length];
        int[] righthigh = new int[t.length];
        int max = 0;
        for(int i = 0;i<t.length;i++) {
            
            if(t[i]>max) { max = t[i]; }
            lefthigh[i] = max;
            System.out.println("icimax ="+max);
        }
        max = 0;
        for(int i = t.length-1;i>=0;i--) {
            
            if(t[i]>max) { max = t[i]; }
            righthigh[i] = max;
            System.out.println("icimin ="+max);
        }
        int water = 0;
        for(int i = 0;i<t.length;i++) {
            water += Math.min(lefthigh[i],righthigh[i])-t[i];
            System.out.println(water);
        }
        
        return water;
    }

 
}