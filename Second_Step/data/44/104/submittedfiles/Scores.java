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
        int[] a = new int[3];
        int b=0;
        int c=0;
        for (int i=0;i<=this.scores.length-1;i++){
            if (this.scores[i]>=a[2]){
                a[2]=this.scores[i];
                b=i;
            }
        }
        for (int i=0;i<=this.scores.length-1;i++){
            if (this.scores[i]>=a[1] && i!=b ){
                a[1]=this.scores[i];
                c=i;
            }
        }
        for (int i=0;i<=this.scores.length-1;i++){
            if (this.scores[i]>=a[0] && i!=b && i!=c){
                a[0]=this.scores[i];
            }
        }
        return a;
    }

 
}