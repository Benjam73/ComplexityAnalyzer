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
        int max = 0;
        int value = 0;
        int n = this.p.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                value += p[j];
                if (value > max){
                    max = value;
                }
            } 
            value = 0;
        }
        return max;
    }
 
}