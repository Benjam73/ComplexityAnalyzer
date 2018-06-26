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
        int max1=0;
        int max2=0;
        int max3=0;
        int a=0;
        int[]podium =new int [3];
        //TODO
        for(int i=0; i<scores.length;i++){
            if(scores[i]>=max1){
                a=max2;
                max3=a;
                max2=max1;
                max1=scores[i];
            }
            else if(scores[i]>=max2){
    max3=max2;
    max2=scores[i];
}
else if (scores[i]>=max3){
    max3=scores[i];
}

podium[0]=max3;
podium[1]=max2;
podium[2]=max1;
}

return podium; 
}
}

