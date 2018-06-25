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
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int e =0;
        int f =0;
        for (int i=0 ; i<this.scores.length ; i++){
            if (a<scores[i]){
                a=scores[i];
                d=i;
            }
        }
        erase(d);
        for (int i=0 ; i<this.scores.length ; i++){
            if (b<scores[i]){
                b=scores[i];
                e=i;
            }
        }
        erase(e);
        for (int i=0 ; i<this.scores.length ; i++){
            if (c<scores[i]){
                c=scores[i];
                f=i;
            }
        }
        erase(f);
        int[] podium = new int [3];
        podium[0]=c;
        podium[1]=b;
        podium[2]=a;
        return podium;
    }
    
    public void erase(int i){
        scores[i]=0;
    }

 
}