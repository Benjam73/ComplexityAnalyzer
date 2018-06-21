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
        int first=0;
        int indexFirst=0;
        int second=0;
        int indexSecond=0;
        int third=0;
        for (int i=0 ; i<this.scores.length ; i++){
            if (this.scores[i]>first){
                first=this.scores[i];
                indexFirst=i;
            }
        }
        for (int i=0 ; i<this.scores.length ; i++){
            if (this.scores[i]>second && this.scores[i]<=first){
                if (i!=indexFirst){
                    second=this.scores[i];
                    indexSecond=i;
                }
            }
        }
        for (int i=0 ; i<this.scores.length ; i++){
            if (this.scores[i]>third && this.scores[i]<=second){
                if (i!=indexFirst && i!=indexSecond){
                    third=this.scores[i];
                }
            }
        }
        int[] podium = new int[3];
        podium[0]=third;
        podium[1]=second;
        podium[2]=first;
        return podium;
        }
        //TODO
    }

