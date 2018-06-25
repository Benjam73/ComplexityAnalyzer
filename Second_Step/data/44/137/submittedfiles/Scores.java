import java.util.Arrays;

/**
 * 
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
    public int firstLargest() {
        int a = 0;
            for (int i = 1; i<this.scores.length; i++) {
                if (this.scores[i] > a) {
                    a = this.scores[i];
                }
                
            }
        return a;
    }
    
    public int secondLargest() {
        int a = 0;
            for (int i = 1; i<this.scores.length; i++) {
                if (this.scores[i] > a && this.scores[i] != this.firstLargest()) {
                    a = this.scores[i];
                }
            }
        return a;
    }
    
    public int thirdLargest() {
        int a = 0;
            for (int i = 1; i<this.scores.length; i++) {
                if (this.scores[i] > a && this.scores[i] != this.firstLargest() && this.scores[i] != this.secondLargest()) {
                    a = this.scores[i];
                }
            }
        return a;
    }
    
    public int[] podium(){
        int a = this.firstLargest();
        int b = this.secondLargest();
        int c = this.thirdLargest();
        int[] L = {a,b,c};
        Arrays.sort(L);
        return L;
    }
}