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
        //TODO
        int sum1 = 0;
        int sum2 = 0;
        int profitmax=0;
        for (int j=0; j<p.length; j++){
            if (sum1>profitmax){
                profitmax=sum1;
            }
            else if (sum2>profitmax){
                profitmax=sum2;
            }
            sum1=0;
            sum2=0;
            for (int i = 0; i<j+1 ; i++){
                sum1 = sum1 + p[i];
            }
            for (int k = j; k<p.length; k++ ){
                 sum2 = sum2 + p[k];
            }
          
        }
        return profitmax;
        
    }

 
}