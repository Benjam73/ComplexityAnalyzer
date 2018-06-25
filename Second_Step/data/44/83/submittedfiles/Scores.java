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
        //TODO
        int[]scoresATrier = scores;
        int[]podium = new int[3];
        
        for (int k=0; k<3;k++){
            int max =0;
            int index =0;
            for(int i=0; i<scoresATrier.length;i++){
                if(scoresATrier[i]>=max){
                    max =scoresATrier[i];
                    index = i;
                    
                }
            }
            podium[2-k]= max;
            scoresATrier[index]=0;
        }
        return podium;
    }

 
}