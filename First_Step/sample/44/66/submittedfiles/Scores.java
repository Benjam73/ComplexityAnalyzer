/**
 * A class to manipulate a set of scores.
 */
public class Scores {

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
        int max12=0;
        int max22=0;
        int max32=0;
        int i1=0;
        int i2=0;
        int i3=0;
        
        for (int i =0; i< this.scores.length; i++ ){
            if (this.scores[i]>max12){
                max12=this.scores[i];
                i1=i;
            }
        }
        this.scores[i1]=0;
        
        
        for (int j =0; j< this.scores.length; j++ ){
            if (this.scores[j]>max22){
                max22=this.scores[j];
                i2=j;
            }
        }
        this.scores[i2]=0;
        
        for (int k =0; k< this.scores.length; k++ ){
            if (this.scores[k]>max32){
                max32=this.scores[k];
                i3=k;
            }
        }
        this.scores[i3]=0;
    
        int[]podium= {max32,max22,max12};
        return podium;
    }
    

 
}