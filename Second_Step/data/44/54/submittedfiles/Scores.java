import java.util.Arrays;
/**
 * A class to manipulate a set of scores.
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    private int[] podium;
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
        int max2=0;
        int max3=0;
        int i1=0;
        int i2=0;
        int i3=0;
        
        for(int i=0;i<scores.length;i++){
            if(scores[i]>max1){
                max1=scores[i];
                i1=i;
            }
            else{
            }
        }
        scores[i1]=0;
        for(int j=0;j<scores.length;j++){
            if(scores[j]>max2&&scores[j]<=max1){
                max2=scores[j];
                i2=j;
            }
            else{
            }
        }
        scores[i2]=0;
        for(int k=0;k<scores.length;k++){
            if(scores[k]>max3&&scores[k]<=max2){
                max3=scores[k];
                i3=k;
            }
            else{
            }
        }
        scores[i3]=0;
        
        int podium []={max3,max2,max1};
        return podium;
    }
}