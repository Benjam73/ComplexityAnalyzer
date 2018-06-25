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
        int []podium={0,0,0};
        int n=this.scores.length;
        for (int k=0; k<n ;k++){
            if(scores[k]>podium[2]){
                    podium[2]=scores[k];
            }
            else{ 
                if (scores[k]>podium[1]){
                    podium[1]=scores[k];
                }
                else{
                    if (scores[k]>podium[0]){
                        podium[0]=scores[k];
                    }
                }
            }
        }
        return podium;
    }

 
}