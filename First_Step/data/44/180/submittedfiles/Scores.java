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
    public void miseaZero (int i) {
        this.scores[i] = 0 ; 
    }
    
    public int[] podium(){
        
        int a = 0 ; 
        int b = 0 ;
        int c = 0 ;
        int d = 0 ;
        int e = 0 ;
        
        for (int i = 0 ; i < this.scores.length ; i++) {
            if (this.scores[i] > a ) {
                a = this.scores[i] ;
                d = i ;
            }
        }    
        miseaZero(d) ;
        for (int i = 0 ; i < this.scores.length ; i++) {
            if (this.scores[i] > b ) {
                b = this.scores[i] ;
                e = i ;
            }
        }
        miseaZero(e) ;
        for (int i = 0 ; i < this.scores.length ; i++) {
            if (this.scores[i] > c ) {
                c = this.scores[i] ;
            }
        }    
        
        int[] podium = new int[3] ;
        podium[0] = c ;
        podium[1] = b ;
        podium[2] = a ;
        return podium ;
    } 
}