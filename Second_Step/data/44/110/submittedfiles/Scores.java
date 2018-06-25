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
        int[] podium = new int[3];
        if (this.scores.length>=3) {
            int max =  this.scores[0];
            int indicemax=0;
            int compteur = 0;
            for (int j=0; j<3;j++){
                max=0;
                this.scores[indicemax]=0;
                for (int i=0; i<this.scores.length; i++) {
                    if  (this.scores[i]>max) {
                        max = this.scores[i];
                        indicemax=i;
                        podium[2-j]=max;
                    }
                }
            
            }
        }
        return(podium);
    }

 
}