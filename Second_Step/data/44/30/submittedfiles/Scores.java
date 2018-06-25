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
        int[] sc = scores;
        int[] scb = scores;
        int[] scbb = scores;
        int max = 0;

        for(int i = 0; i<this.scores.length;i++){
            if(this.score[i]<this.score[i+1]){
                max = score[i+1];
            }
            else{
                max = score[i];
            }
            return max;
            
            }
        return a;
        scb = scores;
        }
    }

 
}