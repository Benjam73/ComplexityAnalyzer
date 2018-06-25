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
        int[] t= new int [3];
        for (int i=0;i<3;i++){
            int a = this.scores[0];
            for (int j=0;j<this.scores.length;j++){
                if (this.scores[j]>a){
                    a=this.scores[j];
                }
            }
            t[i]=this.scores[a];
            this.scores[a]=0;
        }
        int b=t[0];
        t[0]=t[2];
        t[2]=b;
        return t;

    }

 
}