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
        int qte=0;
        for (int i=0;i<n-1;i++){
            int maxADroite = this.maxADroite(i);
            int maxAGauche = this.maxAGauche(i);
            int minDesMax=Math.min(maxADroite,maxAGauche);
            qte+=minDesMax-t[i];
        }
        return qte;
    }
    
    private int maxADroite(int i){
        int n = t.length;
        int max=t[i];
        for (int j=i+1;j<n;j++){
            if(t[j]>max){
                max=t[j];
            }
        }
        return max;
    }
    
    private int maxAGauche(int i){
        int n = t.length;
        int max=t[i];
        for (int j=i-1;j>=0;j--){
            if(t[j]>max){
                max=t[j];
            }
        }
        return max;
    }
}