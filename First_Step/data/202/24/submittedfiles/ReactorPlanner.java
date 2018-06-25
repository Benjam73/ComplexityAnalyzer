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
     * returns the sum of the profit between period i and period j
     **/
     public int profit(int i,int j){
         int s=0;
         if (i==j){
             s+=this.p[i];
         } else {
            for (int k=i;k<j+1;k++){
                 s+=this.p[k];
            }
         }
         return s;
     }
    
    /**
     * returns the maximum profit
     **/
    public int maxProfit(){
        int max=0;
        int n=this.p.length;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int s=0;
                s=this.profit(i,j);
                if (s>max){
                    max=s;
                }
            }
        }
        return max;
    }

 
}