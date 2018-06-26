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
        int max = this.maxI(0);
        for(int i=1;i<this.p.length;i++){
            if (this.maxI(i)>max){
                max = this.maxI(i);
            }
        }
        return max;
    }
    
    public int maxI(int pos){
        int maxI = this.p[pos];
        int sum = 0;
        for (int i = pos; i<this.p.length;i++){
            sum += this.p[i];
            if (sum > maxI){
                maxI = sum;
            }
        }
        return maxI;
    }

 
}