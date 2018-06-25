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
        int max = this.scores[0];
        int[] podium = new int[3];
        int numero=0;
        for (int j=2; j>=0; j=j-1){
            for (int i=0; i<this.scores.length; i++){
                if (this.scores[i]>=max){
                    max = this.scores[i];
                    numero = i ; //on retient le numero pour pouvoir ensuite enlever le score du tableau
                }
            
            }
            podium[j]=max;
            max=0;
            this.scores[numero]=0;
        }
        return podium;
    }

 
}