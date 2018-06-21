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
        this.scores=new int[scores.length];
        for (int i=0;i<scores.length;i++){
            this.scores[i]=scores[i];
        }
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int N1=scores[0];
        int N2=0;
        int N3=0;
        for(int i=1;i<this.scores.length;i++){
            if(scores[i]>N1){
                N3=N2;
                N2=N1;
                N1=scores[i];
            }
            else if(scores[i]>N2){
               N3=N2;
               N2=scores[i];
            }
            else if(scores[i]>N3){
                N3=scores[i];
            }
        }
        int[] P=new int[3];
        P[0]=N3;
        P[1]=N2;
        P[2]=N1;
        return P;
    }
   

 
}