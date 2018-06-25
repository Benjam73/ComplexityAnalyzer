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
    public void max(){
    	int max=0;
    	for(int i=0; i<this.t.length; i++){
    		if(this.t[i]<this.t[i+1]){
    			max=t[i];
    		}
    	}
    }
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int water(){
    	int diff=0;
    	int qtewater=0;
    	int max1=0;
    	int max2=0;
        for(int i=0; i<this.t.length; i++){
        	if(this.t[i]>this.t[i+1]){
        		int ini=i+1;
        		while(this.t[ini]<this.t[ini+1]){
        			ini+=1;
        		}
        		if(this.t[i]<this.t[ini]){
        			qtewater = this.t[i];
        		}
        	}
        }
    }

 
}