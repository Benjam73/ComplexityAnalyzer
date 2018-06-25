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
        int [] l1 = new int [scores.length];
        int [] l3 = new int [3];
        l1 = this.scores;
        int a = 0;
        int b = 0;
        int c = 0;
        int pos = 0;
        for (int i=0; i<scores.length; i++) {
            if (l1[i]>a) {
                a = l1[i];
                pos = i;
            }
        }
        l1[pos] = 0;
        for (int i=0; i<scores.length; i++) {
            if (l1[i]>b) {
                b = l1[i];
                pos = i;
            }
        }
        l1[pos] = 0;
        for (int i=0; i<scores.length; i++) {
            if (l1[i]>c) {
                c = l1[i];
                pos = i;
            }
        }
        l3[0]=c;
        l3[1]=b;
        l3[2]=a;
        
        return l3;
        
        //TODO
    }

 
}