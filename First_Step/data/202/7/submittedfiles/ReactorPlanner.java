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
        int[]s = new int[this.p.length];
        
        int m=p[0];
        for(int i=0; i<p.length ; i++){
            for(int j=i; j<p.length ; j++){
                
                s[i]= s[i] + p[j];
                
                if (m<s[i]){
                    m=s[i];
                }
            }
            
        }
        return m;
    }

 
}