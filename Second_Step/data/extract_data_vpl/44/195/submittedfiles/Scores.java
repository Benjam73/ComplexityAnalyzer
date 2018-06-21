/**
 * A class to manipulate a set of scores.
 */
public class Scores {

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
    
    public void scoreTrie(){
	    	int tampon=0;
	    	for(int j =0; j<scores.length;j++){
	    	for (int i = 0; i < this.scores.length-1; i++) {
				if (this.scores[i] < this.scores[i++]){
					tampon = this.scores[i];
					this.scores[i] = this.scores[i++];
					this.scores[i++] = tampon;
					tampon=0;
	            
	        }
	    }
    }
    }
	 /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     *  	
     **/
     

    public int[] podium(){
        int [] podium = new int [3];
            podium[0]=scores.
	    	
	    }
     		


 
}