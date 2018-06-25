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
         
        trier(scores);
        int[] t = {scores[scores.length-3],scores[scores.length-2],scores[scores.length-1]};
        return t;
            
            
            
        
     
        
    }
    
    public static void trier(int[] tableau) {
		int i, j, cle;
		
		for (i = 1; i < tableau.length; i++) {
			cle = tableau[i];
			j = i;
			while ((j >= 1) && (tableau[j - 1] > cle)) {
				tableau[j]  = tableau[j - 1] ;
				j = j - 1;
			}
			tableau[j] = cle;
		}
	}
    

 
}

