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
    
    //Returns the maximum score in Scores
    public int getMaxInScores(int [] scores){
        int max = scores[0];
        int indiceDuMax = 0;
        for (int i = 1; i < scores.length; i++){
            if (max < scores[i]){
                max = scores[i];
                indiceDuMax = i;
            }
        }
        scores[indiceDuMax] = 0;
        return max;
    }

    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int max1 = getMaxInScores(scores);
        System.out.println("max1 = " + max1);
        //deleteMaxInScores(max1);
        int max2 = getMaxInScores(scores);
        //deleteMaxInScores(max2);
        int max3 = getMaxInScores(scores);
        int[]threeBestScores = {max3, max2, max1};
        //int[] monCherTableau = {String.max1, String.max2, String.max3};
        return threeBestScores;
    }

 
}