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
    public static void tri(int[]scores){
        int inter = 0;
        for(int i=0; i<scores.length-1; i++){
            if (scores[i]>scores[i+1]){
                inter = scores[i+1];
                scores[i] = scores[i+1];
                scores[i+1] = inter;
            }else{
                
            }
            
        }
        
    }
    
    //public int[] podium(){
        //return(scores[]);
        
        //TODO
    //}

 
}