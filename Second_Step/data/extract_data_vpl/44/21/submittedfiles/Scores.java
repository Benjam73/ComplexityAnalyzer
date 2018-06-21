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
        
        int[] trio = new int[3];
        int a=0;
        int b=0;
        int c=0;
        for (int i =0; i <scores.length; i++) {
            if (scores[i]>=a) {
                if (scores[i]>=b) {
                    if (scores[i]>=c) {
                        a=b;
                        b=c;
                        c=scores[i];
                    }
                else {
                    a=b;
                    b=scores[i];
                }
                }
                
            else {a=scores[i];}
            }
        }
    trio[0]=a;
    trio[1]=b;
    trio[2]=c;
    return trio;
    }

 
}