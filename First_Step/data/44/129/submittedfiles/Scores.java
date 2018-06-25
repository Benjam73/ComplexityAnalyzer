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
        int[] largest=new int [3];
        int max1=this.scores[0];
        for(int i=0;i<=this.scores.length-1;i++){
            if(this.scores[i]>max1){
                max1=this.scores[i];
                int i1=i;
            }
        }
        if(this.scores[0]!=max1){
            int max2=this.scores[0];
        }else{
            int max2=this.scores[1];
        }
        for(int j=0;i<=this.scores.length-1;j++){
            if((this.scores[j]>max2) && (j!=i1)){
                max2=this.scores[j];
                i2=j;
            }
        }
        if((this.scores[0]!=max1)&&(this.scores[0]!=max2)){
            int max3=this.scores[0];
        }else if((this.scores[1]!=max1)&&(this.scores[1]!=max2)){
            int max3=this.scores[1];
        }else{
            int max3=this.scores[2];
        }
        for(int k=0;i<=this.scores.length-1;k++){
            if((this.scores[k]>max3)&&(k!=i1)&&(k!=i2)){
                max3=this.scores[k];
            }
        }
        this.largest[0]=max3;
        this.largest[1]=max2;
        this.largest[2]=max1;
        return this.largest;
        
    }
}