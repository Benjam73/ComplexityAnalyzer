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
    public int[] podium(){
        int[] podium = new int[3];
        for(int k=0; k<3; k++){
            int[] c = new int[2];
            c=this.biggest();
            podium[2-k]=c[0];
            scores[c[1]]=0;
        }
        return podium;
    }
    
    
    public int[] biggest(){
        int[] m = new int[2];
        m[0]= scores[0];
        m[1]=0;
        for(int k=1; k<scores.length; k++){
            if(scores[k]>m[0]){
                m[0]=scores[k];
                m[1]=k;
            }
        }
        return m;
    }

 
}