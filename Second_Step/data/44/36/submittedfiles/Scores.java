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
    }
    
    public int[] tri(){
        if (scores.length<3){
            return [0,0];
        }
        scores2 = new int[scores.length];
        for (int i=0; i<scores.length,i++){
            scores2[i] = scores[i];
        }
        for (int i=0; i<scores.length, i++) {
             
        }
        
        
    }

 
}