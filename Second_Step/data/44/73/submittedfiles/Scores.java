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
        int max1=0;
        int compteur1=0;
        int max2=0;
        int compteur2=0;
        int max3=0;
        int compteur3=0;
        for(int i=0; i<scores.length;i++){
            if(scores[i]>max1){
                max1=scores[i];
                compteur1=i;
            }
        }
        for(int i=0;i<scores.length;i++){
            if(scores[i]>max2 && i!=compteur1){
                max2=scores[i];
                compteur2=i;
            }
        }
        for(int i=0;i<scores.length;i++){
            if(scores[i]>max3 && compteur1!=i && compteur2!=i){
                max3=scores[i];
            }
        }
        scores=new int[3];
        scores[0]=max3;
        scores[1]=max2;
        scores[2]=max1;
        return scores;
    }

 
}