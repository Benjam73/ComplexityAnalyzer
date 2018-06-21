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
    public void tri(int[] board) {
        int j, tab;
        for (int i=1; i<board.length; i++) {
            tab=board[i];
            j=i;
            while (j>0 && board[j-1]>tab) {
                board[j]=board[j-1];
                j=j-1;
            }
            board[j]=tab;
        }
    }

     
    public int[] podium(){
        //TODO
        tri(scores);
        
        int[] result=new int[3];
        for (int k=0; k<result.length;k++) {
            result[2-k]=this.scores[scores.length-1-k];
        }
        return result;
    }
}