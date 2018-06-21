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
        int[] rkd=new int [3];
        rkd[0]=0;
        rkd[1]=0;
        rkd[2]=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>=rkd[2]){
                rkd[1]=rkd[2];
                rkd[0]=rkd[1];
                rkd[2]=scores[i];
                
            }else if(scores[i]>=rkd[1]){
                rkd[0]=rkd[1];
                rkd[1]=scores[i];
            }else if(scores[i]>=rkd[0]){
                rkd[0]=scores[i];
            }
        }
        return rkd;
        //TODO
    }

 
}