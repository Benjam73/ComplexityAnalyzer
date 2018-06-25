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
    
    public int maxGauche (int pos) {
    	int max = this.t[0];
    	for (int i=1;i<pos;i++) {
    		if (this.t[i]>max) {
    			max = this.t[i];
    		}
    	}
    	return max;
    }
    
    public int maxDroite (int pos) {
    	int n = this.t.length;
    	int max = this.t[n-1];
    	for (int i=n-1;i>pos;i--) {
    		if (this.t[i]>max) {
    			max = this.t[i];
    		}
    	}
    	return max;
    }
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int water(){
        int quantite = 0;
        for (int i=1;i<this.t.length;i++) {
        	int maxG = this.maxGauche(i);
        	int maxD = this.maxDroite(i);
        	quantite += Math.max(0, Math.min(maxG, maxD)-t[i]);
        }
        return quantite;
    }

 
}