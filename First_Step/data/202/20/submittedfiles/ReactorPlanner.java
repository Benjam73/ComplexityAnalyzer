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
    public int sumBetween(int i, int j){
        int sum=0;
        for (int k=i;k<=j;k++){
            sum+=p[k];
        }
        return sum;
    }
    public int maxProfit(){
        int len = this.p.length;
        int profit = sumBetween(0,len -1);
        int maxprofit = sumBetween(0,len -1);
        if(len==1){
            return profit;
        }
        for (int i=0;i<len;i++){
            if( maxprofit < profit - sumBetween(len-1-i,len-1)){
                maxprofit = profit- sumBetween(len-1-i,len-1);
            }
            if(maxprofit < profit - sumBetween(0,i)){
                maxprofit = profit- sumBetween(0,i);
            }
        }
        return maxprofit;
    }

 
}