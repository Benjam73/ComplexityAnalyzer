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
    public int[] podium() {
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        int min = Math.min(scores[0], Math.min(scores[1], scores[2]));
        int moy = 0;
        if(scores[0] >= min && scores[0] <= max){
            moy = scores[0];
        }
        if(scores[1] >= min && scores[1] <= max){
            moy = scores[1];
        }
        if(scores[2] >= min && scores[2] <= max){
            moy = scores[2];
        }
        
        for(int i = 3; i < scores.length; i++){
            if(scores[i] > max){
                min = moy;
                moy = max;
                max = scores[i];
            }else{
                if(scores[i] > moy){
                    min = moy;
                    moy = scores[i];
                }else{
                    if(scores[i] > min){
                        min = scores[i];
                    }
                }
            }
        }
        
        int[] podium = new int[3];
        podium[0] = min;
        podium[1] = moy;
        podium[2] = max;
        
        return podium;
    }

 
}