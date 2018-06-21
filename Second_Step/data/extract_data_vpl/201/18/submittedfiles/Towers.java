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
        
        
        int j =0;
        int waterKeeped = 0;
        int avant = 0;
        for(int i = 0; i < t.length ; i++){
            j = i+1;
            int currentTop = t[i];
            avant = waterKeeped;
            while( j < t.length - 1 && t[j] < currentTop){
                waterKeeped+=currentTop-t[j];
               j++;
            }
            if(j == t.length && !(t[j-1] == currentTop)){
                waterKeeped = avant;
            }
        }
        
        return waterKeeped;
        
    }

 
}