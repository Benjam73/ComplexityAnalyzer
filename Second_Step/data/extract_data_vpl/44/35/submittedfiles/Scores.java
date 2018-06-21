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
     
     public static void triInsertion (int []scores){
         int n = scores.length;
         for (int i=1; i<n; i++){
             int k=i;
             int val =scores[i];
             while (k>=1 && val<scores[k-1]){
                 scores[k]=scores[k-1];
                 k=k-1;
             }
             scores[k]=val;
         }
     }
             
    public int[] podium(){
    
        triInsertion(scores);
        int score1 =scores[scores.length-1];
        int score2 =scores[scores.length-2];
        int score3 =scores[scores.length-3];
        int []score = new int[3];
        score[0]=score3;
        score[1]=score2;
        score[2]=score1;
        
        return score;
        
        

    }

 
}