	
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
		 * retourne le max d'un tableau
		 *
		 */
	    public int getMax () {
	        int max = this.scores[0];
	        for (int i = 0; i<this.scores.length; i++) {
	            if (this.scores[i] > max) {
	                max = this.scores[i];
	            }
	        }
	        return max;
	    }
	    
	    
	    
	    /**
		 * retourne le min d'un tableau
		 *
		 */
		 public int getMin() {
		    int min = this.scores[0];
	        for (int i = 0; i<this.scores.length; i++) {
	            if (this.scores[i] < min) {
	                min = this.scores[i];
	            }
	        }
	        return min;
		 }
	    
	    /**
		 * retourne un tableau contenant les valeurs du tableau précédent, 
		 * et remplacant un maximum par le minimum
		 * sil y a plusieurs fois le meme max, on n'en remplace qu'un
		 */
	    public int [] tab_sans_max () {
	        int compteur_max = 0;
	        int [] tab_sans_max = new int [this.scores.length];
	    	for (int i = 0; i<this.scores.length; i++) {
	    		if (this.scores[i] != this.getMax()) {
	    		    tab_sans_max[i] = this.scores[i];
	    		}
	    		else if (this.scores[i] == this.getMax() && compteur_max==0 ){
	    		    tab_sans_max[i] = this.getMin() ;
	    		    compteur_max ++;
	    	    }
	    	    else {
	    	        tab_sans_max[i] = this.scores[i];
	    	    }
	    	}
	    	return tab_sans_max;
	    }
	    
	    
	    /**
	     * returns a table of the three largest elements of t sorted 
	     * from smallest to largest.
	     * (You can add intermediate methods reflecting your top- down
	     * analysis if you need to)
	     **/
	    public int[] podium(){
	        int [] podium = new int[3];
	        Scores tab1 = new Scores (this.scores);
	        podium [2] = tab1.getMax();
	        Scores tab2 = new Scores (tab1.tab_sans_max());
	        podium [1] = tab2.getMax();
	        Scores tab3 = new Scores (tab2.tab_sans_max());
	        podium[0] = tab3.getMax();
	        return podium;
	    }

	 
	}