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
        //TODO
        int n = this.scores.length;
        int[] t= new int[n];
        int [] result=new int [3];
        int k=t[0];
        for(int i=1;i<n;i++){
            if(k<t[i]){
                k=t[i];
            }
        result=result+t[i] ;  
        }
    return result;    
    }

 
}