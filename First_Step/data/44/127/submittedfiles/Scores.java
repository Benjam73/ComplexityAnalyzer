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
        int premier = this.scores[0];
        int deuxieme = this.scores[0];
        int troisieme = this.scores[0];
        for (int i = 0 ; i < this.scores.length-1 ; i++){
            if (this.scores[i+1] > this.scores[i]){
                premier = this.scores[i+1];
            }
        }
        for (int j = 0 ; j < this.scores.length-1 ; j++){
            if ((this.scores[j+1] > this.scores[j]) && (this.scores[j+1] != premier)){
                deuxieme = this.scores[j+1];
            }
        }
        for (int k = 0 ; k < this.scores.length-1 ; k++){
            if ((this.scores[k+1] > this.scores[k]) && (this.scores[k+1] != premier) && (this.scores[k+1] != deuxieme)){
                troisieme = this.scores[k+1];
            }
        }
        
        int [] podium ;
        podium = new int[3];
        podium[0] = troisieme;
        podium[1] = deuxieme;
        podium[2] = premier;
        
        return podium;
        
       
        
        //TODO
    }

 
}