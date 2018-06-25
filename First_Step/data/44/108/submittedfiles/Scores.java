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
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    
    public int max(){
        int imax=0;
        int m =this.scores[0];
        for (int i=1; i<this.scores.length; i++){
            if (this.scores[i]>m){
                m=this.scores[i];
                imax=i;
            }
        }
    this.scores.remove(imax);
    return(m);
    }
    
    public int[] podium(){
        int m1 = this.scores.max();
        int m2 = this.scores.max();
        int m3 = this.scores.max();
        return(new int[]{m3,m2,m1});
    }
 
}