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
        int[] pod = new int[3];
        for (int i=0; i<3; i++) {
            pod[i]=0;
        }
        
        int n = this.scores.length;
        for (int i=0; i<n; i++) {
            if (scores[i]>pod[2]) {
                pod[0]=pod[1];
                pod[1]=pod[2];
                pod[2]=scores[i];
            } else if ((scores[i]>pod[1])) {
                pod[0]=pod[1];
                pod[1]=scores[i];
            } else if ((scores[i]>pod[0])) {
                pod[0]=scores[i];
            }
        
        }
        return pod;
        
    }

 
}