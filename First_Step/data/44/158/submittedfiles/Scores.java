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
        int o=0;
        int a=0;
        int b=0;
        int [] Sco= new int[3];
            for(int i=0; i<scores.length; i++){
                if(scores[i]>o){
                   b=a;
                   a=o;
                   o=scores[i];
                    scores[i]=0;
            }
                    else if(scores[i]>a){
                        b=a;
                        a=scores[i];
                        scores[i]=0;
                    }
                        else if(scores[i]>b){
                            b=scores[i];
                            scores[i]=0;
                        }
            }
            Sco[0]=b;
            Sco[1]=a;
            Sco[2]=o;
            return(Sco);
                        
    }

 
}