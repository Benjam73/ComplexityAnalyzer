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
   
    int n = this.scores.length;
    int[] L = new int[3];
    
    for(int i =0 ; i<n ; i++){
        int k = i;
        int val = scores[i];
        
        while (k >=1 && val < this.scores[k-1]){
            this.scores[k]=this.scores[k-1];
            k=k-1;
        }
        this.scores[k]=val;
    }
    
    L[0]=this.scores[n-3];
    L[1]=this.scores[n-2];
    L[2]=this.scores[n-1];
    
    return L;
    
   
    }
    
 
}