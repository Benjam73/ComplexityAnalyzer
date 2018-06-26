/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    private int[] max;
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] scores) {
        this.scores = scores;
        max = new int[3];

        
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int max1 = 0;
        int max2=0;
        int max3 =0;
        if (scores[1] < scores[0] && scores [0]> scores[2]){
            max1 = scores[0];
            if (scores[1] > scores[2]){
                max2= scores[1];
                max3 = scores[2];
            }
            else {
                max2= scores[2];
                max3 = scores[1];
            }
        }
        else if (scores[1] > scores[0] && scores[1] > scores[2]){
            max1 = scores[1];
            if (scores[0]<scores[2]){
                max2 = scores[2];
                max3 = scores[0];
            }
            else {
                max2 = scores[0];
                max3 = scores[2];
            }
        }
        else if (scores[1] < scores[2] && scores[0] < scores[2]){
            max1 = scores[2];
            if(scores[1] < scores[0]){
                max2=scores[0];
                max3=scores[1];
            }
            else {
                max2=scores[1];
                max3=scores[0]; 

            }
        }
        for (int i=3; i<scores.length;i++){
            if (scores[i]>max3){
                if(scores[i]>max2){
                    if (scores[i]>max1){
                        max3=max2;
                        max2=max1;
                        max1=scores[i];
                    }
                    else{
                        max3=max2;
                        max2=scores[i];
                    }
                }
                else {
                    max3 = scores[i];
                }
            }
        }

    max[0]=max3;
    max[1]=max2;
    max[2]=max1;
    return max;
    }


 
}