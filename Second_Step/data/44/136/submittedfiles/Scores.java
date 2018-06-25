/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
import java.util.Arrays;
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
        Arrays.sort(this.scores);
        int n = scores.length;
        podium[2]=scores[n-1];
        podium[1]=scores[n-2];
        podium[0]=scores[n-3];
        return podium;
        
    }

 
}