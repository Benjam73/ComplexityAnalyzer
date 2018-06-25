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
        boolean dejatrie=false;
        int temp;
        int n=scores.length;
        int i=0;
        while(i<n-1 && !dejatrie){
            dejatrie=true;
            for(int j=0;j<n-1-i;j++){
                if(scores[j]>scores[j+1]){
                    dejatrie=false;
                    temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                }
            }
            i++;
        }
        int[] podium=new int[3];
        podium[2]=scores[scores.length-1];
        podium[1]=scores[scores.length-2];
        podium[0]=scores[scores.length-3];
        return podium;
    }
}