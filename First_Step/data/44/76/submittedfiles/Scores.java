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
        int[]pod = new int [3];
        for (int k=0 ; k<2 ; k++){
            pod[k]=0;
        }
        for (int i=0 ; i<scores.length ; i++){
            while (i<scores.length){
                if (this.scores[i]>this.scores[i+1]){
                int temp = this.scores[i+1];
                this.scores[i+1]=this.scores[i];
                this.scores[i]=temp;
                }
            }
        }
        pod[0]=this.scores[scores.length-3];
        pod[1]=this.scores[scores.length-2];
        pod[2]=this.scores[scores.length-1];
        return pod;
    }

 
}