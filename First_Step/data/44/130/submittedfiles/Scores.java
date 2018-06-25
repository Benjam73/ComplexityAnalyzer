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
    	int [] classement = new int[3];
        //TODO
    	int max1 = this.maximum();
    	int p1 = this.position();
    	this.scores[p1]=0;
    	int max2 = this.maximum();
    	int p2 = this.position();
    	this.scores[p2]=0;
    	int max3 = this.maximum();
    	int p3 = this.position();
    	this.scores[p3]=0;
    	classement[0]=max3;
    	classement[1]=max2;
    	classement[2]=max1;
    	return classement;
    	
    }
    
    public int maximum() {
		int max = this.scores[0];
		double a = this.scores.length;
		
		for (int i = 0 ; i < a ; i++) {
			int h = this.scores[i];
			if (max >= h) {
				
			}else {
				max = h;
				i=0;
			}
		}
		return max;
	}
    
    public int position() {
    	int position = 0;
		int max = this.scores[0];
		double a = this.scores.length;
		
		for (int i = 0 ; i < a ; i++) {
			int h = this.scores[i];
			if (max >= h) {
				
			}else {
				max = h;
				position = i;
				i=0;
				
			}
		}
		return position;
	}

 
}