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
        /*int sum=0;
        for (int i=0; i<p.length-1; i++){
            sum=sum +p[i];
            if (sum+p[i+1]>sum){
                sum=sum +p[i+1];
            }
            else {
                sum=p[0];
            }
    
        }*/
        int num = Integer.MIN_VALUE;
        for (int i = 0; i<p.length; i++) {
            
            for (int j = i; j<p.length; j++) {
                int sumCurr = 0;
                for (int k = i; k<=j; k++) {
                    sumCurr += p[k];
                }
                if (sumCurr > num) {
                    num = sumCurr;
                }
            }
        }
        return num;
    }
    
    

 
}