public class Scores {
	/**
	 * A class to manipulate a set of scores.
	 */

	    /**
	     * The scores obtained during the competition
	    **/
	    private int[] scores;
	    
	    /**
	     * Constructor of scores 
	     ***/
	    public Scores(int[] scores) {
	        this.scores = scores;
	    }
	    
	    public int[] podium(){
	        int[] pod = new int[3];
	        int a = 0;
	        int b = 0;
	        int c = 0;
	             for (int i = 0; i<scores.length; i++){
	                if (scores[i] > a){
	                    c = b;
	                    b = a;
	                    a = scores[i];
	                }else if (scores[i] > b){
	                    c= b;
	                    b = scores[i];
	                }else if (scores[i] > c){
	                    c = scores[i];
	             }
	             }
	             pod[0]=c;
	             pod[1]=b;
	             pod[2]=a;
	             return pod;
}
}