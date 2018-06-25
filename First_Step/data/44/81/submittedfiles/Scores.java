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
     * 
     **/
  
    public int[] podium(){
        int n=this.scores.length;
        int max=0;
        int maxdeux =0;
        int maxtrois= 0;
        
        for(int i=0; i<n;i++){
            if (scores[i]>scores[max]){
                max=i;
            }
        }
        
        if (max == 0) {
            maxdeux = 1;
        }
        for(int i=1; i<n;i++){
            if (i != max && scores[i] > scores[maxdeux]){
                maxdeux=i;
            }
        }
        
        if (max == 0 || maxdeux == 0) {
            if (max ==1 || maxdeux ==1){
                maxtrois = 2;
            }
            else{
                maxtrois = 1;
            }
        }

        for(int i=1; i<n;i++){
            if (i != max && i != maxdeux && scores[i] > scores[maxtrois]){
                maxtrois=i;
            }
        }
        
        
        int[] podiumfinal = new int[3];
        podiumfinal[0]= this.scores[maxtrois];
        podiumfinal[1]=this.scores[maxdeux];
        podiumfinal[2]=this.scores[max];
     
        return podiumfinal;
    }
}
         

 
