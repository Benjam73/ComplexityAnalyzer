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
        int sum=p[0];
        int max=p[0];
        for(int i=0; i<this.p.length-1; i++){
            for (int j=i+1; j<this.p.length; j++ ){
                sum += p[j];
                if (sum>max){
                    max = sum;
                }
            }
            sum = p[i+1];
        }
        return max;
    }

 
}