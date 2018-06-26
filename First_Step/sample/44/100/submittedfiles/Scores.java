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
        int[] tab = new int[3];
		tab[0] = 0;
		tab[1] = 0;
		tab[2] = 0;
		for (int i = 0; i < this.scores.length; i++) {
			if (this.scores[i] > tab[2]) {
				tab[0] = tab[1];
				tab[1] = tab[2];
				tab[2] = this.scores[i];
			} else if (this.scores[i] > tab[1]) {
				tab[0] = tab[1];
				tab[1] = this.scores[i];
			} else if (this.scores[i] > tab[0]) {
				tab[0] = this.scores[i];
			}
		}
		return tab;
    }

 
}