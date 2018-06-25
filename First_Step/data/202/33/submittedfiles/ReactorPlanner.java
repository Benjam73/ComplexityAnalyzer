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
     * @return the maximum profit (non-linear method)
     **/
    public int[] maxProfitNonLinear(){

    	int max=0;
    	int minintervalle=0;
    	int maxintervalle=0;
    	for (int i=0;i<p.length;i++) {
    		for (int j=0;j<p.length-i;j++) {
    	    	int somme=0;
    			int[] intervalle= new int[p.length];
    			intervalle[j]=p[j];
    			for (int k=intervalle.length-j;k<intervalle.length;k++) {
    				somme+=intervalle[k];
    			}
    			if (somme>=max) {
    				max=somme;
    				minintervalle=j;
    				maxintervalle=intervalle.length+j;
    			}
    			
    		}
    	}
    	int[] result= {max,minintervalle,maxintervalle};
        return (result);
    }
    /**
     * @return the maximum profit 
     **/
    public int maxProfit() {
    	return maxProfitNonLinear()[0];
	}

 
}