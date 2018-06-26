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
        int[]p=new int[3];
        p[0]=0;
        p[1]=0;
        p[2]=0;
        int k=0;
        int j=0;
        
        for(int i=0;i<this.scores.length;i++){
           if(this.scores[i]>p[2]){
               p[2]=this.scores[i];
               k=i;
           } 
        }
        for(int i=0;i<this.scores.length;i++){
           if(this.scores[i]>p[1] && k!=i){
               p[1]=this.scores[i];
               j=i;
               
           } 
        }
        for(int i=0;i<this.scores.length;i++){
           if(this.scores[i]>p[0] && k!=i && j!=i){
              p[0]=this.scores[i];
           } 
        }
        return p;
        
    }

 
}