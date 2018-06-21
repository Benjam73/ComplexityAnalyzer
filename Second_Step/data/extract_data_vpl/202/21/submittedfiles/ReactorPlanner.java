/**
 * A class to represent the reactor planner.
 * @author hadrien cambazard
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
        //TODO
        List<int> nbreInterval = new List<int>();
        for (int i=0; i<this.p.length-1; i++) {
            int a = i;
            for (int j=a+1; j<this.p.length; j++) {
                int b = j;
                int[] interval = int [2];
                interval[0] = a;
                interval[1] = b;
                }
            }
        }
        
        int[] interval = int[]
    }

 
}