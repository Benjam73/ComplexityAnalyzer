/**
 * A class to represent the reactor planner.
 * @author hadrien cambazard
 */
 
 import java.lang.Number;
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
        int N = p.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = i; j < N; j++)
            {
                sum +=p[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max; 
        
        
    }

    

 
}