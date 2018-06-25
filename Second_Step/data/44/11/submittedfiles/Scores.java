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
    
    public int researchLargestIndex(){
        int scoreMax = 0;
        int index = -1 ;
        for(int i = 0 ; i < this.scores.length; ++i ){
            if( this.scores[i] > scoreMax ){
                scoreMax = this.scores[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int [] tab = new int[3];
        for(int i = 0 ; i < tab.length; ++i){
            int index = researchLargestIndex();
            tab[tab.length - 1 - i] = this.scores[index];
            this.scores[index] = 0;
        }
        return tab;
    }

 
}