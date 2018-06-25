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
    
    public int minimum(){
        int mini = Math.min(this.scores[0],this.scores[1]);
        for (int i = 1; i<this.scores.length;i++){
            mini=Math.min(mini,this.scores[i]);
        }
        return mini;
    }
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int podium [];
      podium = new int [3];
        int max1 = this.minimum();
        int max2 = this.minimum();
        int max3 = this.minimum();
        int n = this.scores.length;
        for (int i = 0; i <n ; i++){
            if (this.scores[i]>max1){
                max3=max2;
                max2=max1;
                max1=this.scores[i];
            }else if(this.scores[i]>max2){
                max3=max2;
                max2=this.scores[i];
            }else if(this.scores[i]>max3){
                max3=this.scores[i];
            }
        }
        podium[0]=max3;
        podium[1]=max2;
        podium[2]=max1;
        return podium;
    }
}
