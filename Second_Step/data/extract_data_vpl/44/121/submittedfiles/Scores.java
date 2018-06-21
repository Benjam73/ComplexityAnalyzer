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
     
     public int max(){
         int max = scores[0];
         for(int i=1;i<scores.length;i++){
             if(scores[i]>max){
                 max=scores[i];
             }
         }return max;
     }
     
     
     
    public int[] podium(){
        int c=0;
        for(int i=0;i<scores.length;i++){
            
        }
        
    }

 
}