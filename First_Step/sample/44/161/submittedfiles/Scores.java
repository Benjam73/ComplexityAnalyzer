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
        int n=scores.length;
        for (int i=1;i<n;i++){
            int k=i;
            int val=scores [i];
            while (k>=1&&val<scores[k-1]){
                scores[k]=scores[k-1];
                k=k-1;
            }
            scores[k]=val;
        }
        int [] tab=new int[3];
        for (int i=0;i<3;i++){
            tab[i]=scores[n-3+i];
        }
        return tab;
    }
 
}