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
        int premier = 0;
        int deuxieme=0;
        int troisieme=0;
        for (int i=0; i<this.scores.length; i++){
            if (troisieme<this.scores[i]){
                if ((this.scores[i]>deuxieme) && (this.scores[i]>=premier)){
                    troisieme=deuxieme;
                    deuxieme=premier;
                    premier=this.scores[i];
                }else{
                    if ((this.scores[i]>=deuxieme)&& (this.scores[i]<premier)){
                        troisieme=deuxieme;
                        deuxieme=this.scores[i];
                    }else{
                        troisieme=this.scores[i];
                    }
                }
            }
        }
        int [] podium = new int [3];
        podium[2]=premier;
        podium[1]=deuxieme;
        podium[0]=troisieme;
        return podium;
    }

 
}