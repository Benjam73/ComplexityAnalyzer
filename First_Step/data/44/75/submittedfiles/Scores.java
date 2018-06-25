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
    
    
    public int [] tri (){
        for(int i=0; i<this.scores.length; i++){
        	int min=i;
        	for(int k=i+1; k<this.scores.length;k++ ){
        		if(this.scores[k]<this.scores[min]){
        			min=k;
        		}
        	}
        	int tampon=this.scores[min];
        	this.scores[min]=this.scores[i];
        	this.scores[i]=tampon;
        }
        return this.scores;
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int[] triee=tri();
        int[] podium= new int[3];
        podium[0]=triee[triee.length-3];
        podium[1]=triee[triee.length-2];
        podium[2]=triee[triee.length-1];
        return podium;
    }

 
}