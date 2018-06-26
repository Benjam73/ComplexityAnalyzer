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
         int[] pod = new int[3]; 
         pod[0] = -1;
         pod[1] = -1;
         pod[2] = -1;
        for(int i = 0; i < scores.length; i++) {
            miseAJourPodium(pod,scores[i]);
        }
        return pod;
    }


    public  void miseAJourPodium(int[] podium, int val){
        if (val > podium[2]) { 
            podium[0] = podium[1]; 
            podium[1] = podium[2];
            podium[2] = val;
        } else if (val > podium[1]) { 
            podium[0] = podium[1]; 
            podium[1] = val;
        } else if (val > podium[0]) { 
            podium[0] = val;
        }
    } 
}