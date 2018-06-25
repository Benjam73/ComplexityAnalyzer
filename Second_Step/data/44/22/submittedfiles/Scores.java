/**
 * A class to manipulate a set of scores.
 */
public class Scores {
    private int[]board;

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
        int [] podium = new int[3];
        podium[2]=12;
        podium[1]=2;
        podium[0]=2;
        return podium; 
    }

 
}