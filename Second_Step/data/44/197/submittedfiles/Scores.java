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
     
    private int top(){
        int top = scores[0];
         for(int i= 0 ; i<scores.length; i++){
             if(scores[i]>top){
                 top=scores[i];
             }
         }
         return top;
    }
    
    private int second(){
        int second = scores[0];
         for(int i= 0 ; i<scores.length; i++){
             if(scores[i]>second && scores[i]!=this.top()){
                 second=scores[i];
             }
         }
         return second;
    }
    
    private int third(){
        int third = scores[0];
         for(int i= 0 ; i<scores.length; i++){
             if(scores[i]>third && scores[i]!=this.top() && scores[i]!=this.second()){
                 third=scores[i];
             }
         }
         return third;
    }
    
    public int[] podium(){
        this.tri();
        int [] podium= {scores[scores.length-3],scores[scores.length-2],scores[scores.length-1]};
        return podium;
        }
        
    public int[] tri(){
        int i, j, cle;
		
		for (i = 1; i < scores.length; i++) {
			cle = scores[i];
			j = i;
			while ((j >= 1) && (scores[j - 1] > cle)) {
				scores[j]  = scores[j - 1] ;
				j = j - 1;
			}
			scores[j] = cle;
		}
        return scores;
    }
    
    }
    
    
