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

    
    public int sum(int[] p,int a, int b){
        int comp = 0;
        for(int i = a;i<=b;i++){
            comp = comp + p[i];
        }
        return comp;
    }
     
    public int maxProfit(){
        int max = p[0];
        int comp = 0;
        for(int i = 0;i<p.length;i++){
            for(int j = i;j<p.length;j++){
                comp = sum(p,i,j);
                if(comp>max){
                    max = comp;
                }
            }
        }
        return max;
    }

 
}