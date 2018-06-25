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
        int premier=0;
        int deuxieme=0;
        int troisieme=0;
        int milieu=0;
        int [] podium= new int [3];
        if (this.scores [1]>= this.scores[0] ){
            premier = this.scores [1];
            deuxieme= this.scores [0];
        }
        else{
            premier = this.scores [0];
            deuxieme = this.scores [1];
        }
        if (this.scores [2] >= premier){
            troisieme= deuxieme;
            deuxieme=premier;
            premier= this.scores [2];
        }
        else{
            if (this.scores [2] >= deuxieme){
                troisieme= deuxieme;
                deuxieme=this.scores[2];
            }
            else {
                troisieme=this.scores [2];
            }
        }
        for (int i = 3; i<this.scores.length;i++){
            if (this.scores [i] >= premier ){
                troisieme= deuxieme;
                deuxieme=premier;
                milieu=this.scores [i];
                premier = milieu;
            }
            else {
                if (premier>=this.scores[i] && this.scores [i] >= deuxieme){
                    troisieme = deuxieme;
                    milieu=this.scores[i];
                    deuxieme=milieu;
                }
            else {
                if (deuxieme>=this.scores[i] && this.scores [i] >= troisieme){
                    troisieme= this.scores[i];
                }
                else{
                    premier= premier;
                    deuxieme=deuxieme;
                    troisieme=troisieme;
                }
            }    
            }
        } 
        podium[0]= troisieme;
        podium[1]= deuxieme;
        podium[2]= premier;
        return podium;
    }

 
}