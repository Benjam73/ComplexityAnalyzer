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
        int p=scores[0];
        int s=scores[0];
        int t=scores[0];
        int[] podium=new int[3];
        for (int i=0;i<scores.length-1;i++) {
            if (scores[i]<scores[i+1]) {
                p=scores[i+1];
                podium[2]=p;
            } else if (scores[i]<scores[i+1] && scores[i+1]!=p) {
                s=scores[i+1];
                podium[1]=s;
            } else if (scores[i]<scores[i+1] && scores[i+1]!=s && scores[i+1]!=p) {
                t=scores[i+1];
                podium[0]=t;
            }
        } return podium;
    }
}