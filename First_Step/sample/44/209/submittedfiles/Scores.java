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
        //TODO
        int troisieme=0;
        int deuxieme=0;
        int premier=0;
        
        for(int i=0;i<scores.length;i++){
            if(scores[i]>=premier){
                troisieme=deuxieme;
                deuxieme=premier;
                premier=scores[i];
            }else if(scores[i]>=deuxieme&&scores[i]<premier){
                troisieme=deuxieme;
                deuxieme=scores[i];
            }else if(scores[i]>=troisieme&&scores[i]<deuxieme){
                troisieme=scores[i];
            }
        }
        int podium[]={troisieme,deuxieme,premier};
        return podium;
    }

}