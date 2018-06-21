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
        int[] clas = new int[3];
        clas[0] = 0;
        clas[1] = 0;
        clas[2] = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i]>clas[2]){
                int tempf=clas[2];
                int temps=clas[1];
                clas[2] = scores[i];
                clas[1]=tempf;
                clas[0]=temps;
                scores[i]=0;
            }else if(scores[i]>clas[1]){
                int temp=clas[1];
                clas[1] = scores[i];
                clas[0]=temp;
                scores[i]=0;
            }else if(scores[i]>clas[0]){
                clas[0] = scores[i];
                scores[i]=0;
            }
        }
       return clas; 
    }
    
}