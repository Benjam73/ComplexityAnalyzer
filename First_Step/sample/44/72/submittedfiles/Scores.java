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
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 0 ; i< scores.length; i++){
            if (scores[i]>first){
                third = second;
                second = first;
                first = scores [i];
                
            } else{
                if (scores[i]>second){
                    third = second;
                    second = scores [i];
                } else {
                    if (scores[i]>third){
                        third = scores[i];
                    }
                }
            }
        }
        int[] result = new int [3];
        result[2]=first;
        result[1]=second;
        result[0]=third;
        return result;
    }

 
}