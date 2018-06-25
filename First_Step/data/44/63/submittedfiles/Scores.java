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
        int p = scores[0];
        int s = scores[1];
        int t = scores[2];
        for(int i = 0;i<scores.length;i++){
            if(scores[i] > p && scores[i] > s && scores[i] > t){
                p = scores[i];
            }
            else if(scores[i] == p && scores[i] > s && scores[i] > t){
                s = scores[i];
            }
            else if(scores[i] < p && scores[i] > s && scores[i] > t){
                s = scores[i];
            }
            else if(scores[i] < p && scores[i] == s && scores[i] > t){
                t = scores[i];
            }
            else if(scores[i] < p && scores[i] < s && scores[i] > t){
                t = scores[i];
            }
        }
        int[] table = new int[]{t,s,p};
        return table;
    }

 
}