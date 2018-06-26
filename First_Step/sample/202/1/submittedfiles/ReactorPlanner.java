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
        int sum=0;
        for (int i=0; i<this.p.length; i++){
            for (int k=this.p.length;k>i;k=k-1){
                int s=0;
                for (int j=i;j<k;j++){
                    s=this.p[j]+s;
                    if (s>sum){
                        sum=s;
                    }
                }
            }
        }return sum;
    }

 
}