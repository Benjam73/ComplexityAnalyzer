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
     
    private int[] inserer (int[] board, int i){
        if (i > board[0] && i > board[1] && i > board[2]) {
            board[0]=board[1];
            board[1]=board[2];
            board[2]=i;
        }
        else if (i > board[0] && i > board[1] && i <= board[2]) {
            board[0]=board[1];
            board[1]=i;
        }
        else if (i > board[0] && i <= board[1] && i <= board[2]) {
            board[0]=i;
        }
        return board;
        
    }
    public int[] podium(){
        int [] board = new int[3];
        for (int j = 0; j < 3; j++) {
            board[j] = 0;
        }
        for (int i = 0; i < scores.length ; i++){
                inserer(board, scores[i]);
        }
    return board; 
    }

 
}