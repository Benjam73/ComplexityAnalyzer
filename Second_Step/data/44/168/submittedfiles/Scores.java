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
        //TODO
    	int first = 0 ;
    	int second = 0 ;
    	int third = 0 ;
    	int podium[] = {third, second, first};
    	
    	for(int i = 0 ; i < scores.length ; i++){
    		if(scores[i] >= first){
    			third = second ; second = first ; first = scores[i] ;
    		}
    		if((scores[i] < first) && (scores[i] >= second)){
    			third = second ; second = scores[i] ;
    		}
    		if((scores[i] < second) && (scores[i] >= third)){
    			third = scores[i] ;
    		}
    	}
    	podium[2] = first;
    	podium[1] = second;
    	podium[0] = third;
    	return podium ;
    	
    	//scanner la liste (boucle for) avec trois if dans lesquels on compare le 1st à la case et on décale le cas échéant. idem pour les autres
    	//un return de la liste des trois plus grands
    }

}