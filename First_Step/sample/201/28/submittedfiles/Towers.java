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
        for (int i = 1 ; i<n-1; i++){
            int maxonr=this.maxRight(i);
            int maxonl=this.maxLeft(i);
            int min=Math.min(maxonr,maxonl)-this.t[i];
            qte += Math.max(0,min);
        }    
        return qte;
    }
    private int maxRight(int j){
        int n = t.length;
        int max =0;
        for (int i =j;i <n;i++){
            if(t[i]>=max){
                max = t[i];
            }
        }
        return max;
    }
    private int maxLeft(int j){
        int n =t.length;
        int max=0;
        for(int i = 0; i<j;i++){
            if(t[i]>=max){
                max = t[i];
            }
        }
        return max;
    }
 
}