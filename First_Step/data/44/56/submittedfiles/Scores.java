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
    public int min(){
        int min= scores[0];
        for(int i =1; i<scores.length; i++){
            if (scores[i]<min){
                min=scores[i];
            }
        }
        return min;
    }
        
    public int[] podium(){
        int max1 = scores[0];
        int max2 = this.min();
        int max3 = this.min();
            
        for(int i =1; i<scores.length; i++){
            if (scores[i]>max1){
                max3=max2;
                max2=max1;
                max1=scores[i];
            }
            else if (scores[i]>max2){
                max3=max2;
                max2=scores[i];
                    
            }
            else if (scores[i]>max3){
                max3=scores[i];
            }
        }
        int[] monTableau = {max3,max2,max1};
        return monTableau;
    }

     
}
    

 
