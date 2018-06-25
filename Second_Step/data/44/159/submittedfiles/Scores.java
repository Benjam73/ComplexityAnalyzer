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
        int premier = 0;
        int second = 0;
        int third = 0;
        for (int i=0; i<scores.length; i++){
            if (this.scores[i]>=premier){ 
                third=second;
                second=premier;
                premier=this.scores[i];
            }
            else {
                if(this.scores[i]>=second){
                    third=second;
                    second=this.scores[i];
                }
                else {
                    if(this.scores[i]>=third){
                        third=this.scores[i];
                    }
                }
            }
        }
        int[] result =new int[3];
        result[0]=third;
        result[1]=second;
        result[2]=premier;
        return result;
    }

 
}