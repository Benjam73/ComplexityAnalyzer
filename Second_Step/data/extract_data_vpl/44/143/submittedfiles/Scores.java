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
        int[]podium= new int[3];
        for(int i=0;i<this.scores.length-1;i++){
            int min = i;
            for(int l=i+1;l<this.scores.length;l++){
                if(this.scores[l]<this.scores[min]){
                    min=l;
                }
            }
            int p = this.scores[min];
            this.scores[min]=this.scores[i];
            this.scores[i]=p;
        }
        podium[0]=this.scores[this.scores.length-3];
        podium[1]=this.scores[this.scores.length-2];
        podium[2]=this.scores[this.scores.length-1];
        return podium;//TODO
    }
}