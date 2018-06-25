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
        int a=0;
        int b=0;
        int c=0;
        int[] tableau=new int[3];
        for(int i=0;i<scores.length;i++){
        	if(scores[i]>a){
        		c=b;
        		b=a;
        		a=scores[i];
        		scores[i]=0;
        	}else if(scores[i]>b){
        		c=b;
        		b=scores[i];
        		scores[i]=0;
        	}else if(scores[i]>c){
        		c=scores[i];
        		scores[i]=0;
        	}
        }
        tableau[0]=c;
        tableau[1]=b;
        tableau[2]=a;
        return tableau;
    }

 
}