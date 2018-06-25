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
        int [] scoresSorted = sort(this.scores);
        int n = this.scores.length;
        int[] res = new int[]{this.scores[n-3],this.scores[n-2],this.scores[n-1]};
        return res;
    }
    
    public int[] sort(int[] t){
        int n = t.length;
        if (n >= 3) {
            for (int i = 0 ; i < n-1 ; i++){
                int min = i;
                for (int k = i+1 ; k<n ; k++){
                    if (t[k] < t[min]){
                        min = k;
                    }
                }
                echanger(t,min,i);
            }
        }
        return t;
    }
    public void echanger(int[] t , int idx1 , int idx2){
        int temp = t[idx1];
        t[idx1] = t[idx2];
        t[idx2] = temp;
    }
}