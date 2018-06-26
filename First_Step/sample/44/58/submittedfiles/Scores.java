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
        int [] pod= new int [3];
        for (int i=0;i<=this.scores.length-1;i++){
            if (this.scores[i]>pod[2]){
                pod[0]=pod[1];
                pod[1]=pod[2];
                pod[2]=this.scores[i];
            }
            else if (this.scores[i]>pod[1]){
                pod[0]=pod[1];
                pod[1]=this.scores[i];
            } 
            else if (this.scores[i]>pod[0]){
                pod[0]=this.scores[i];
            } 
        }
        return pod;
    }

 
}