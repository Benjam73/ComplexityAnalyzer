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
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        //TODO
    	for(int i = 0; i < scores.length; i++){
    		for(int j = i+1; j < scores.length; j++){
    			if(scores[i] > scores[j]){
    				int t;
    				t = scores[i];
    				scores[i] = scores[j];
    				scores[j] = t;
    			}
    		}
    	}
    	int[] k = new int[3];
    	k[0] = scores[scores.length - 3];
    	k[1] = scores[scores.length - 2];
    	k[2] = scores[scores.length - 1];
    	
    	return k;
    	
    }

 
}