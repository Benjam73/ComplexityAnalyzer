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
        int i = scores.length-1;
        int max = 0;
        int sec = 0;
        int th = 0;
        
        while(i>-1) {
            if(scores[i] >= max) {
                th = sec;
                sec = max;
                max = scores[i];
            } else if(scores[i] >= sec) {
                th = sec;
                sec = scores[i];
            } else if(scores[i] > th) {
                th = scores[i];
            }
            i--;
        }
        
        int[] res = {th, sec, max};
        return res;
    }

}