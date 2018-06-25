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
        int m1=0;
        int m2=0;
        int m3=0;
        int [] podium=new int[3];
        
        for (int i=0;i<scores.length;i++){
            
            if(scores[i]>m1){
                m1=scores[i];
            }
        }    
        for (int i=0;i<scores.length;i++){  
            
            if(scores[i]>m2 && scores[i]<m1){
                m2=scores[i];
            }
        }
        for (int i=0;i<scores.length;i++){  
            
            if(scores[i]>m3 && scores[i]<m2){
                m3=scores[i];
            }
        }
        podium[0]=m3;
        podium[1]=m2;
        podium[2]=m1;
    return(podium);
    }

 
}