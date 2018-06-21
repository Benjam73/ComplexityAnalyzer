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
     
    /**
     * return the maximum of the element of the set of scores
     **/
    public int maxScore(){
        int max = this.scores[0];
        int rang = 0;
        for(int i=1; i<this.scores.length;i++){
            if (max < this.scores[i]){
                max = this.scores[i];
                rang = i;
            }
        }
        this.scores[rang] = 0;
        return max;
    }

    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int[] podium = new int[3]; //declaration affectation et initialisation du podium
        for(int i=0; i<3;i++){
            podium[i]=0;
        }
        podium[2]= this.maxScore();
        podium[1]= this.maxScore();
        podium[0]= this.maxScore();
        return podium;
        
        
    }

 
}