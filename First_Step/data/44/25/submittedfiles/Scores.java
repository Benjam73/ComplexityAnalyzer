/**
 * A class to manipulate a set of scores.
 */
public class Scores{ 
    

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
    public int [] podium(){

        int [] L = new int[3];
        int n = this.scores.length; 
        for (int i=1; i < n; i++){
            int k = i;
            int val = scores [i];
            while (k>=1 && val < scores [k-1]){
                scores[k]=scores[k-1];
                k=k-1;
                
            }
            scores[k]=val;
        }
        
        L[2]= scores[n-1];
        L[1]= scores[n-2];
        L[0]= scores[n-3];
    
        return L;
    }
}    
    


    

