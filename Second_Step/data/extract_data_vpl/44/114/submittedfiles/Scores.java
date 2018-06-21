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
    public void triS(){
        for (int i = 0; i < this.scores.length -1;i++){
            int min = this.scores[i];
            int p = i;
            for (int j = i+1; j < this.scores.length; j++){
                if (min > this.scores[j]){
                    min = this.scores[j];
                    p = j;
                }
            }
            this.scores[p] = this.scores[i];
            this.scores[i] = min;
        }
    }
    
    public int[] podium(){
        //TODO
        this.triS();
        int n = this.scores.length;
        int[] Podium = new int[3];
        Podium[0] = this.scores[n-3];
        Podium[1] = this.scores[n-2];
        Podium[2] = this.scores[n-1];
        return(Podium);
    }

 
}