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
    
    public int max (int a, int b){
        if (a>=b){
            return a;
        }
        else if (b>a);
            return b;
    }
    
    public int min (int a, int b){
        if (a>=b){
            return b;
        }
        else if (b>a);
            return a;
    }
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        //TODO
        int max3= min(this.scores[0], min(this.scores[0], this.scores[1]))
        int max2= max(this.scores[0], this.scores[1]);
        int max1= max(this.scores[0], max(this.scores[0], this.scores[1]))
        for (int i=0; i<this.scores.length; i++){
            
        }
    }

 
}