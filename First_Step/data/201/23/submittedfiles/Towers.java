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
     
    public int maxRight (int i){
        int n =this.t.length;
        int max=this.t[i];
        if (i==n-1){
            max = 0;
        }
        for (int x=i+1; x<=n-1; x++){
            if (this.t[x]>max){
                max = this.t[x];
            }
        }
    return(max);
    }
    
    public int maxLeft( int i){
        int max=this.t[i];
        if (i==1){
            max = 0;
        }
        for (int x=i-1; x>0; x--){
            if (this.t[x]>max){
                max = this.t[x];
            }
        }
    return(max);
    }
    
    public int water(){
        int n =this.t.length;
        int qte= 0;
        for (int i=1; i<=n-1; i++){
            int maxRight = this.maxRight(i);
            int maxLeft = this.maxLeft(i);
            int min = Math.min(maxRight,maxLeft);
            qte = qte + Math.max(0,min);
        }
    return(qte);
    }

 
}