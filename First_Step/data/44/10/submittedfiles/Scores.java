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
        int[] pod = new int[3];
        int a=0; int b=0;
        if (scores[1]>scores[2]){
            if (scores[1]>scores[3]){
                a=scores[2]; b=scores[3];
                scores[3]=scores[1];
                scores[2]=b;
                scores[1]=a;
            }
            else{
                a=scores[2]; b=scores[3];
                scores[3]=scores[1];
                scores[2]=b;
                scores[1]=a;
            }
        }
        else{
            if (scores[2]>scores[3]){
                if (scores[1]>scores[3]){
                a=scores[3]; b=scores[2];
                scores[3]=scores[1];
                scores[1]=a; scores[2]=b;
                }
                else{
                    a=scores[3]; 
                    scores[3]=scores[2];
                    scores[2]=a;
                }
            }
        }
        
        for(int i=0;i<3;i++){
            pod[i]=scores[i];
        }
        
        int d=0;
        int e=0;
        for (int i = 3; i < scores.length-1; i++){
            if(scores[i]>pod[0]){
                if(scores[i]>pod[1]){
                    if(scores[i]>pod[2]){
                        d=scores[i];
                        pod[2]=scores[i];
                        e=pod[1];
                        pod[1]=d;
                        pod[0]=e;
                    }
                    else{
                        e=pod[1];
                        pod[1]=scores[i];
                        pod[0]=e;
                    }
                }
                else{
                    pod[0]=scores[i];
                }
            }
        }
    return pod;    
    }
}
