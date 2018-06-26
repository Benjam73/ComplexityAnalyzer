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
        for(int i =1;i<n-1;i++){
            int maxDroite = this.maxOnRight(i);
            int maxGauche = this.maxOnLeft(i);
            qte = qte + Math.max(0,Math.min(maxDroite,maxGauche)-t[i]);
        }
        return qte;
    }
    
    public int maxOnLeft(int pos){
        int max =0;
        for(int i = 0;i<pos;i++){
            if(t[i]>max){
                max = t[i];
            }
        }
        return max;
    }
    
    public int maxOnRight(int pos){
        int max = 0;
        for (int i =pos+1;i<t.length;i++){
            if(t[i]>max){
                max = t[i];
            }
        }
        return max;
    }

 
}