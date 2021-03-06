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
        int n = this.p.length;
        int max = Math.max( this.p[0],0);
        for ( int i = 0; i < n; i++) {
            int sum = 0;
            for ( int j = i; j < n; j++) {
                sum = sum + this.p[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

 
}