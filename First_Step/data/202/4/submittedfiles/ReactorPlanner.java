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
        int somme=0;
        int max=0;
        for(int i=0;i<this.p.length;i++){
            somme=this.p[i];
            if(somme>max){
                max=somme;
            }
            for(int j=i+1;j<this.p.length;j++){
                somme=somme+this.p[j];
                if(somme>max){
                    max=somme;
                }
            }
        }
        return(max);
    }

 
}