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
        int[] podium = new int [3];
        for (int i=2 ; i>=0 ; i--){
            
            int max=this.max();
            podium[i]=max;
            this.annuleMax();
       }
       return podium;
    }
   
     public void annuleMax(){
         int n= this.scores.length;
         int indice=0;
         
         for (int i=0 ; i<=n-1; i++){
             if (this.scores[i] == this.max()){
                 indice = i;
                 
             }
             
         }
         this.scores[indice]=0;    
         
     }
     
     public int max(){
        int max= this.scores[0];
        int n = this.scores.length;
        for (int i=0; i<n; i++){
            if (this.scores[i]>max){
                max=scores[i];
            }
        }
        return max;
    }
 
}