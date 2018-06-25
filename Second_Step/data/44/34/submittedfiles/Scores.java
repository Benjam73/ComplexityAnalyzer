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
    
    public int[] tri(int[] podium,int d){
        int a= podium[0];
        int b=podium[1];
        int c=podium[2];
        if (d>a&&d<=b){
            podium[0]=d;
        }
        else if (d>b&&d<=c){
            podium[0]=podium[1];
            podium[1]=d;
        }
        else if (d>c){
            podium[0]=podium[1];
            podium[1]=podium[2];
            podium[2]=d;
        }
        else{
            return podium;
        }
        return podium;
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        //TODO
        int [] podiu= new int[3];
        for (int j=0;j<podiu.length;j++){
            podiu[j]=0;
        }
        for (int i=0; i<scores.length;i++){
            tri(podiu,scores[i]);
        }
        return podiu;
    }

 
}