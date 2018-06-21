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
    int []podium=new int[3];
    
       int transition=0;   
     
        for(int i =1; i<scores.length; i++){
            if(scores[i]>podium[2]){
                scores[i]=podium[2];
                podium[1]=podium[2];
                podium[0]=podium[1];
            }else if(scores[i]>podium[1]){
                 podium[0]=podium[1];
                scores[i]=podium[1];
                
            }else if(scores[i]>podium[0]){
                podium[0]=scores[i];
            }
        }
        return podium;
    }
        

 
}