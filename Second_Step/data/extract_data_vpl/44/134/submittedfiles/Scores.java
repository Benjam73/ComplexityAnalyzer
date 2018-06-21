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
        int[] podium = new int[3];
        for (int j=2; j>=0;j--) {
        	podium[j] = maximum();
        	
        }
        return podium;
    }

    public String toStringPodium() {
    	int [] podium = podium();
    	return "["+podium[0]+";"+podium[1]+";"+podium[2]+"]";
    }
    /**
     * Fonction permettant de récuperer le maximum d'un tableau
     * @return l'entier maximal du tableau
     */
    public int maximum() {
    	int max = this.scores[0];
    	int abs = 0;
    	for (int i=1;i<this.scores.length;i++) {
    		if (this.scores[i]>max) {
    			max = this.scores[i];
    			abs = i;
    		}
    	}
    	this.scores[abs]=0;
    	return max;
    }
 
}