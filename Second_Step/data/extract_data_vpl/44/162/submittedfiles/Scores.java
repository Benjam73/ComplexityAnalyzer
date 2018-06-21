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
    	int[] podium = new int[3];
    	int n = this.scores.length;
    	
    	for(int i=0; i<3;i++){
    		podium[i]=0;
    	}
    	
    	for(int i=0; i<n; i++){
    		int current = scores[i];
    		
    		if(current>podium[0] && current<=podium[1]){
    			podium[0] = current;
    		}
    		else if(current>podium[1] && current<=podium[2]){
    			podium[0] = podium[1];
    			podium[1] = current;
    		}
    		else if(current>=podium[2]){
    			podium[0] = podium[1];
    			podium[1] = podium[2];
    			podium[2] = current;
    		}
    	}
    	return podium;
    }
}