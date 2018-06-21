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
       public int[] max(int[] scores,int longueur) {
    	int taille=scores.length;
    	int[] max=new int[2];
    	max[0]= scores[0];
    	
    	for(int i=0; i<taille-longueur; i++) {
    		if(max[0]<scores[i]) {
    			max[0]=scores[i];
    			max[1]=i;
    		}
    	}
    	return max;
    	
    }
    
    
   
    
    
    public int[] podium(){
        //TODO
    	int taille=this.scores.length;
    	int [] podium= new int[3];
    	for(int i=0;i<3;i++) {
    		int max=max(this.scores,i)[0];
        	this.scores[max(this.scores,i)[1]]=this.scores[taille-1-i];
        	this.scores[taille-1-i]=max;
    		podium[2-i]=max;
    	}
    	return podium;
    }
 
}