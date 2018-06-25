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
        Scores scoresTemp = new Scores(this.scores);
        int v1;
        int v2;
        int v3;
        int e;
        v1 = scoresTemp.maximum();
        e = scoresTemp.emplacementMax();
        scoresTemp.enlever(e);
        v2 = scoresTemp.maximum();
        e = scoresTemp.emplacementMax();
        scoresTemp.enlever(e);
        v3 = scoresTemp.maximum();
        e = scoresTemp.emplacementMax();
        scoresTemp.enlever(e);
        int[] a = new int[3];
        a[0] = v3;
        a[1] = v2;
        a[2] = v1;
        return a;
        
        //TODO
    }
    
    public int emplacementMax() {
        int e = 0;
        int max = scores[0];
        for (int i = 1; i<scores.length ; i++) {
            if (scores[i]>max) {
                e = i;
                max = scores[i];
            }
        }
        return e;
    }
    
    public int maximum() {
        int max = scores[0];
        for (int i = 1; i<scores.length ; i++) {
            if (scores[i]>max) {
                max = scores[i];
            }
        }
        return max;
    }
    
    public void enlever(int i) {
        scores[i] = 0;
    }

 
}