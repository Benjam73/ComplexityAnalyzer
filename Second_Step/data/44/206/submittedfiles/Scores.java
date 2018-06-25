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
        int[] tab = {0,0,0};
		for (int i=0; i < scores.length;i++ ){
			if (scores[i]>tab[2]){
				tab[0]=tab[1];
				tab[1]=tab[2];
				tab[2]=scores[i];
			}
			else if (scores[i]>tab[1]){
				tab[0]= tab[1];
				tab[1]= scores[i];
			}
			else if (scores[i]>tab[0]){
				tab[0]=scores[i];
			}
		}
		return tab;
    }

 
}