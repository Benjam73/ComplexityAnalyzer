/**
 * A class to represent the set of towers.
 * @author hadrien cambazard
 */
public class Towers {

    /**
     * A table of integers to model the towers
    **/
    	    /**
	     * A table of integers to model the towers
	    **/
	    private int[] t;
	    
	    /**
	     * Constructor of scores 
	     ***/
	    public Towers(int[] thetowers) {
	        this.t = new int[thetowers.length];
	        for (int i = 0; i < t.length; i++) {
	            this.t[i] = thetowers[i];
	        }
	    }
	    
	    /**
	     * returns the quantity of water trapped by the towers
	     * You can add you own intermediate methods
	     **/
	    public int water(){
	        int first = 0;
	        int last = t.length -1 ;
	        while (first < last){
	            if(t[first]<=t[first+1]){
	                first=first+1;
	            }
	            if(t[last]<t[last-1]){
	                last = last-1;
	            }
	        }
	        if(last==first+1){
	            return 0;
	        } else{
	            int seuil = 0;
	            if(t[first] < t[last]){
	                seuil = first;
	            }else{
	                seuil = last;
	            }
	            int sum=0;
	            for(int i=first+1;i<last;i++){
	                if(t[seuil]>t[i]){
	                    sum+= t[seuil]-t[i];
	                }
	            }
	            return sum;
	        	}
	    }
	      
	        
	        
	    

}
