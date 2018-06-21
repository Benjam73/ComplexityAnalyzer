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
    public int[] podium() {
    	int[] tab = new int [2];
    	for ( int i=0 ; i<tab.length-1 ; i++) {
    		tab[i] =0;
    	}
    	for ( int j =0; j<=scores.length-1; j++) {
    		if (scores[j] > tab[2]) {
    			tab[0]=tab[1];
				tab[1]=tab[2];
				tab[2]=scores[j];
    		}
    		else {
    			if ( scores[j] < tab[1] ) {
    				tab[0]=tab[1];
    				tab[1]=scores[j];
    			}
    			else {
    				if ( scores[j] > tab[0]) {
    					tab[0] = scores[j];
    				}
    			}
    		}
    	}
    	return tab;
    }

}
