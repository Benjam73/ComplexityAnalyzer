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
        int somme=0;
        int maxSomme=0;
        int n=p.length;
        for(int j=0;j<n;j++){
           for (int i=j; i<n;i++){
                somme+=p[i];
                if(somme> maxSomme){
                    maxSomme=somme;
                } 
            }
            somme=0;
        }
        return maxSomme;
    }
}