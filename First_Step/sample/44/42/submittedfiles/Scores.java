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
        int[] podium = new int[3];
        int max1 = scores[0];
        int valinterm = 0;
        for(int i = 1 ; i<this.scores.length ; i++){
            if(scores[i]>max1){
                max1 = scores[i];
                valinterm = i;
            }
            podium[2]=max1;
        }
        scores[valinterm]=0;
         int max2 = scores[0];
        for(int i = 1 ; i<this.scores.length ; i++){
            if(scores[i]>max2){
                max2 = scores[i];
                valinterm = i;
            }
            podium[1]=max2;
        }
        scores[valinterm]=0;
        int max3 = scores[0];
        for(int i = 1 ; i<this.scores.length ; i++){
            if(scores[i]>max3){
                max3 = scores[i];
                valinterm = i;
            }
            podium[0]=max3;
        }
        return podium;
    }
}