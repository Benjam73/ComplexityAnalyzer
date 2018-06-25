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
        int profit=0;
        for (int i=0 ; i<p.length;i++){
            for (int j=i ; j<p.length; j++){
                int sum =0;
                for (int k=0; k<=j-i;k++){
                    sum+=this.p[i+k];
                }
                if (sum>profit){
                    profit=sum;
                }
            }
        }
        return (profit);
        //TODO
    }

 
}