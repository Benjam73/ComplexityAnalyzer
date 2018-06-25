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
        for (int i = 0 ; i < scores.length-1 ; i++) {
            for (int j = scores.length-1 ; i < j ; j--) {
                if (scores[j] > scores[j-1]) {
                    int x = scores[j];
                    scores[j] = scores[j-1];
                    scores[j-1] = x;
                }
            }
        } 
        int ranking[] = {scores[2],scores[1],scores[0]};
        return ranking;
    }

 
}