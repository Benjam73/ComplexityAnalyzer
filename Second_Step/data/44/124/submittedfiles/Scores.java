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
        int [] podium = new int[3];
        int a = this.scores[0];
        int j = 2;
        int z = 3;
        int r=0;
        for(int u = 0; u<3; u++){
            for(int i = 0; i < scores.length-1; i++){
                if(this.scores[i+1]>a){
                    a = this.scores[i+1];
                    r=i+1;
                
                }
            
            }
            this.scores[r] = 0;    
            
            
            podium[j] = a;
            j-=1;
           
            
         
        }
        
        return podium;
        //TODO
    }

 
}