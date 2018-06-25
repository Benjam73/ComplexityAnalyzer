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
     
    public int extrairePlusGrand(){
        int valeurMax = 0;
        int placeValeurMax = 0;
        for(int i=0 ; i<this.scores.length ; i++){
            if(this.scores[i]>valeurMax){
                valeurMax = this.scores[i];
                placeValeurMax = i ;
            }
        }
        this.scores[placeValeurMax] = 0;
        return valeurMax;
    } 
     
     
    public int[] podium(){
        int[] podium = new int[3];
        for(int k=2; k>-1; k--){
            podium[k]=this.extrairePlusGrand();  
        }
        return podium ;         
    }
        //TODO
}

 
