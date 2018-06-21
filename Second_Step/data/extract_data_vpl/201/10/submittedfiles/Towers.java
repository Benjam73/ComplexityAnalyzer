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
    public int maxG(int pos){
        int max = 0;
        for(int i = 0;i<pos;i++){
            if(t[i]>max){
                max = t[i];
            }
        }
        return max;
    }
    
    public int maxD(int pos){
        int max = 0;
        for(int i = pos+1;i<t.length;i++){
            if(t[i]>max){
                max = t[i];
            }
        }
        return max;
    }
    
    
    public int water(){
        int n = t.length - 1;
        int qt = 0;
        for(int i = 1;i<n-1;i++){
            int maxDroite = maxD(i);
            int maxGauche = maxG(i);
            qt = qt + Math.max(0,(Math.min(maxDroite,maxGauche)-t[i]));
        }
        return qt;
    }

}