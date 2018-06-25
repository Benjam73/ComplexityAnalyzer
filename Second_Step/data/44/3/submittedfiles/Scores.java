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
     * 
     *  QUELLE BELLE ANALYSE DESCENDANTE ;)
     **/
    public int[] podium(){
    	
        int first = this.scores[0];
        int second =0;
        int third =0;

  
    
        
        for(int i=0;i<this.scores.length-1;i++){
            
            if(this.scores[i+1]>= first){
                third = second;
                second = first;
                first = this.scores[i+1];
                
            }if(this.scores[i+1] < first && this.scores[i+1] >= second && this.scores[i+1] >= third){
                third = second;
                second = this.scores[i+1];
            }if(this.scores[i+1] < second && this.scores[i+1] >= third){
                
                third = this.scores[i+1];
            }   
            
           
        }
           int[] podium = new int[3];
           podium[0] = third;
           podium[1] = second;
           podium[2] = first;
           
           
        //   System.out.println(third);
        //   System.out.println(second);       
        //   System.out.println(first);
       return podium;
    }

 
}