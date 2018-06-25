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
        int[] threeFirst=new int [3];
        int first=0;
        int second=0;
        int third=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>first){
                third=second;
                second=first;
                first=scores[i];
                scores[i]=0;
            }
            else if(scores[i]>second){
                third=second;
                second=scores[i];
                scores[i]=0;
            }
            else if(scores[i]>third){
                third=scores[i];
                scores[i]=0;
            }
            }
            threeFirst[0]=third;
            threeFirst[1]=second;
            threeFirst[2]=first;
            return threeFirst;
    }
    //TODO
}

 