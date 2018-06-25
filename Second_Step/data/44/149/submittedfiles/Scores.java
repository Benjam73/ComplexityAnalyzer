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
        int podium[] = new int[3];
        podium[0] = 0;
        podium[1] = 0;
        podium[2] = 0;
        for (int i=0; i<scores.length-1;i++){
            if (scores[i+1]>scores[i]){
                podium[2]=podium[i+1];
            }
        }
        for (int j=0;j<scores.length;j++){
            if (scores [j+1]>scores[j] && scores[j+1]<podium[2]){
                podium[1]=scores[j+1];
            }
        }
        for (int k=0;k<scores.length;k++){
            if (scores [k+1]>scores[k] && scores[k+1]<podium[2]){
                podium[0]=scores[k+1];
            }
        }
    return podium; 
    }
}