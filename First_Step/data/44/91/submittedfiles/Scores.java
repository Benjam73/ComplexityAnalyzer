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
        int [] pod = new int [];
        int a = scores[0];
        int b = scores[1];
        int c = scores[2];
        int pod[0] = math.max(a,b,c);
        int pod[2] = math.min(a,b,c);
        
        
        }
    }

 
}