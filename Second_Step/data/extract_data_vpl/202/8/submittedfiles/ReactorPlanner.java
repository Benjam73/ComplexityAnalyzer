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
     
    public int calculeProfit(int a , int b){
        int sum=0;
        for (int k=a ; k<=b ; k++ ){
            sum = sum + this.p[k];
        }
        return sum;
    }
    
    public int maxProfit(){
        int maxProfit=this.p[0];
        int a=0;
        for (int i=0 ; i<this.p.length ; i++) { for (int j=i+1 ; j<this.p.length ; j++) {
                a=calculeProfit(i,j);
                if ( a>maxProfit ) { maxProfit=a;
                }
            }
        }
        return maxProfit ;
    }

 
}