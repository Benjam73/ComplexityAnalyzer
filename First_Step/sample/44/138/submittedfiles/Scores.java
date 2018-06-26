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
        
        int val1=0;
        int val2=0;
        int val3=0;
        for(int i=0; i<scores.length; i++){
            if(val1<=scores[i]){
                val3=val2;
                val2=val1;
                val1=scores[i];
                
            }
    
            else if(val2<=scores[i]){
                val3=val2;
                val2=scores[i];
            }
         
        
       
            else if(val3<=scores[i]){
                val3=scores[i];
            }
         
        }
        int[]podium= new int[3];
        podium[0]=val3;
        podium[1]=val2;
        podium[2]=val1;
        return podium;

    } }

 
