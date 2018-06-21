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
        int[] a = new int[3];
        a[2] = 0;
        a[1] = 0;
        a[0] = 0;
        int b = 0; // la méthode que j'ai faite me parait gloutonne
        int c = 0; // il doit y avoir moyen de l'améliorer
        for (int i = 0; i<scores.length;i++){
            if(scores[i] > a[2]){
                a[2] = scores[i];
                b = i;
            }
        }
        for (int i = 0; i<scores.length;i++){
            if(scores[i]<= a[2] && scores[i]>a[1] && i !=b){
                a[1] = scores[i];
                c = i;
            }
        }
        for (int i = 0; i<scores.length;i++){
            if (scores[i]> a[0] && scores[i]<=a[1] && i !=c){
                a[0] = scores[i];
            }
        }
        return a;
        //TODO
    }

 
}