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
        int max1 = this.scores[0];
        for(int a =1; a<this.scores.length ;a++){
                if(max1 < this.scores[a]){
                    max1= this.scores[a];
                }
        
        podium[2]=max1;
        }
        int max2= this.scores[0];
        for(int a =1; a<this.scores.length ;a++){
                if((max2 < this.scores[a]) &&(this.scores[a]!=podium[2])&&(podium[2]!=this.scores[0])){
                    max2= this.scores[a];
                }
        
        podium[1]=max2;
        }
     
        int max3= this.scores[0];
        for(int a =1; a<this.scores.length ;a++){
                if((max3 < this.scores[a]) &&(this.scores[a]!=podium[2])  &&(this.scores[a]!=podium[1])&&(podium[2]!=this.scores[0])){
                    max3= this.scores[a];
                }
        
        podium[0]=max3;
        }
        
        
        return podium;
        
    }

 
}