/**
 * A class to manipulate a set of scores.
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores ;
    
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] scores) {
        this.scores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            this.scores[i]=scores[i];
        }
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    
    
    
    public int[] podium(){
        //TODO
        int[] r = new int[3] ;
        for (int b = 0 ; b < 3 ; b++) {
            int a = 0 ;
            int m = scores[0] ;
                for(int i = 1 ; i < this.scores.length ; i++) {
                    if (m < scores[i])  {
                        m = scores[i] ;
                        a = i ;
                    }
                }
        
            r[2-b] = this.scores[a] ;
            this.scores[a] = 0 ;
        }
        return r ;
    }

 
}