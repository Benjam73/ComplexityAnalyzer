/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
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
    	int n = this.scores.length;
    	this.ordonne();
    	int[] podium = {this.scores[n-3], this.scores[n-2], this.scores[n-1]};
    	return podium;
    	}
    
        
    public void ordonne(){
    	int n = this.scores.length;
    	for(int i = 1; i<n; i++){
    		int k = i;
    		int val = this.scores[i];
    		while(k>=1 && val<this.scores[k-1]){
    			this.scores[k]=this.scores[k-1];
    			k=k-1;
    		}
    		this.scores[k]=val;
    	}
    }
 
}