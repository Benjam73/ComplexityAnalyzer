/**
 * A class modeling a set of integers (called a profile)
 * @author hadrien cambazard
 */
public class IntegerProfile {

    /**
     * a set of integers
     */
    private int[] profile;

    /**
     * Constructor by data
     * @param prof: a set of integers
     */
    public IntegerProfile(int[] prof) {
        this.profile = new int[prof.length];
        for (int i = 0; i < prof.length; i++) {
            this.profile[i] = prof[i];
        }
    }


    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
   
          

       public int sizeLongestPlateau() {
        //todo
    	int taille= this.profile.length;
    	int longp=0;
    	if(taille==1) {
    	    return 1;
    	} else {
        	int i=1;
        	while (i <taille) {
        		int test=1;
        		int j= i;
        		while(j<taille && (this.profile[j]== this.profile[j-1]) ){
        			test=test+1;
        			j=j+1;
        			
        		}
        		if (test>longp) {
            		longp=test;
            	}
        		
        		i=i+test;
        	}
    		
    		
    	}
    	return longp;
    
}

}
