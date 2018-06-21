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

    	int p1=0;
    	int p2=0;
    	int p3=0;
    	for (int i=0; i<this.scores.length; i++){
    		if (this.scores[i]>p1){
    			p3=p2;
    			p2=p1;
    			p1=this.scores[i];
    		}
    		else if(this.scores[i]>p2){
    			p3=p2;
    			p2=this.scores[i];
    		}
    		else if(this.scores[i]>p3){
    			p3=this.scores[i];
    		}
    	}
    	
    	int pod[] = {p3,p2,p1};
    	System.out.println(p1 + "," + p2 + "," + p3);
    	return pod;
    	
    }

 
}