/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
 import java.util.*;
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    private int[] winners;
    
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
        Arrays.sort(scores);
        int n = scores.length - 1;
        int[] res = {scores[n-2], scores[n-1], scores[n]};
        return res;
        
    }
}    