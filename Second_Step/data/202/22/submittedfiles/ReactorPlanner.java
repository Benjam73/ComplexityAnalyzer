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
    
    public int max(int a, int b) {
    	int max=0;
    	if(a==b) {
    		return this.p[a];
    	} else {
    		for (int i=a; i<b+1; i++) {
    			if (this.p[i]>max) {
    				max=this.p[i];
    			}  		
    		}
    }
    	return max;
    }
    
    //a<b:
    public int sum(int a, int b) {
    	int sum=0;
    	if (a==b) { 
    		return this.p[a];
    	} else {
    	
    	for (int i=a; i<b+1;i++) {
    			sum=sum+this.p[i];
    	}
    		
    	}
    	return sum;
    }
    
    public int maxInterv(int longueur){
        //TODO
    	
    	if(longueur==1 || longueur==0) {
    		ReactorPlanner test= new ReactorPlanner(this.p);
    		return test.max(0,this.p.length-1);
    	} else {
	    	int a= longueur/2;
	    	int b=longueur/2+1;
	    	while(a>0 && sum(0,a)>0) {
	    		a=a-1;
	    	}
	    	while(b<longueur-1 && sum(b,longueur-1)>0) {
	    		b=b+1;
	    	}
	    	return sum(a,b);
    		}
    	
    	
    }
    
    //Idée du programme fausse
    
    public int maxProfit(){
    	int taille=this.p.length;
    	int max=this.p[0];
    	ReactorPlanner test= new ReactorPlanner(this.p);
    	
    	for (int i=1;i<taille+1;i++) {
    		if (test.maxInterv(i)>max) {
    			max=test.maxInterv(i);
    		}
    	}
    	return max;
    		
    		
  	
    	}
    	
    }
    
  