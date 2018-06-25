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
    
    
    public int maxOnLeft(int pos) {
        int max = 0;
        for (int i = 0; i < pos; i++) {
            if (t[i] > max) max = t[i];
        }
        return max;
    }

    public int maxOnRight(int pos) {
        int max = 0;
        for (int i = pos + 1; i < t.length; i++) {
            if (t[i] > max) max = t[i];
        }
        return max;
    }

    
    /**
     * returns the quantity of water trapped by the towers
     **/
    public int water(){
         int n = t.length;
        int qte = 0;
        for (int i = 1; i < n - 1; i++) {
            int maxdroite = this.maxOnRight(i);
            int maxgauche = this.maxOnLeft(i);
            qte += Math.max(0, Math.min(maxdroite, maxgauche) - t[i]);
        }
        return qte;
    }

 
}