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
    public int[] podium(){
        //TODO
        this.trieScores();
        int[] podium = new int[3];
        for (int i=0; i<3; i++) {
            podium[i] = this.scores[this.scores.length - 3 +i];
        }
        return podium;
    }
    public void trieScores() {
        boolean trieOuPas = true;
        while (trieOuPas) {
            trieOuPas = false;
            for (int i=0; i<this.scores.length-1; i++) {
                if (this.scores[i] > this.scores[i+1]) {
                    int temp = this.scores[i];
                    this.scores[i] = this.scores[i+1];
                    this.scores[i+1] = temp;
                    trieOuPas = true;
                }
            }
        }
        
    }
    


 
}