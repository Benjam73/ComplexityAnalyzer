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
        int n = p.length;
        int nombreASommer = 1;
        int max = p[0];
        while(nombreASommer<=n){
            for (int k = 0;k<= n-nombreASommer;k++){
                int sum = p[k];
                for (int i = 1;i<nombreASommer;i++){
                    sum+=p[k+i];
                }max = Math.max(max,sum);
            }
            nombreASommer ++;
        }return max;
    }

 
}