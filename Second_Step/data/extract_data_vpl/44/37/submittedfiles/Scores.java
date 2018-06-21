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
        int p1=0;
        int p2=0;
        int p3=0;
        int[] podium= new int[3];
        for (int i=0; i<scores.length;i++){
            if(scores[i]>p1){
                p3=p2;
                p2=p1;
                p1=scores[i];
                
            }else{ 
                if(scores[i]>p2){
                    p3=p2;
                    p2=scores[i];
                    
                }else{ 
                    if(scores[i]>p3){
                        p3=scores[i];
            }
                }}}
        
        podium[0]=p3;
        podium[1]=p2;
        podium[2]=p1;
        return podium;
        //TODO
    }

 
}