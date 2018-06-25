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
    
    public int max(){
        int maxi = 0;
        for ( int i = 0 ; i < scores.length ; i++){
            if ( scores[i] > scores [i+1] && scores[i] > maxi){
                maxi = scores[i];
            }
        }
        retrun maxi;
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i =0 ; i < scores.length ; i++ ){
            if ( scores[i] > scores[i+1] && scores[i] > a){
                a=scores[i];
                scores[i] = 0;
            }
            
        }
        for (int i =0 ; i < scores.length ; i++ ){
            if ( scores[i] > scores[i+1] && scores[i] > b){
                b=scores[i];
                scores[i] = 0;
            }
            
        }
        for (int i =0 ; i < scores.length ; i++ ){
            if ( scores[i] > scores[i+1] && scores[i] > c){
                c=scores[i];
                scores[i] = 0;
            }
            
        }
        
        return (c;b;a);
        
    }

 
}