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
        //TODO
        int premier = 0;
        int second = 0;
        int troisieme = 0;
        
        int[] liste = new int[3];
        liste[0] = troisieme;
        liste[1] =second;
        liste[2] = premier;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= premier) {
                troisieme = second;
                second = premier;
                premier = scores[i];
            } else if (scores[i] >= second) {
                troisieme = second;
                second = scores[i];
            } else if (scores[i] >= troisieme) {
                troisieme = scores[i];
            }

        }
        
        liste[0] = troisieme;
        liste[1] =second;
        liste[2] = premier;
        return liste;
    }

 
}