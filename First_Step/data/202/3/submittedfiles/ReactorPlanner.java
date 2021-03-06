/**
 * A class to represent the reactor planner.
 */
public class ReactorPlanner {

    /**
     * A table of integers to model the profit for each time period
    **/
    private int[] p;
    
    /**
     * Constructor by data 
     ***/
    public ReactorPlanner(int[] p) {
        this.p = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            this.p[i] = p[i];
        }
    }
    
    /**
     * returns the maximum profit
     **/
    public int maxProfit(){
        int m = p[0];
        for (int i = 0; i<p.length ; i++){
            if (p[i]>m){
                m=p[i];
            }
        }
        int m1=p[0]+p[1];
        for (int i = 0; i<p.length ; i++){
            if (p[i]>m){
                m1=p[i];
            }
        }
    }

 
}