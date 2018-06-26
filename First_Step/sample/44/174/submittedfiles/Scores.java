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
        int[] podium = new int[3];
        podium[2] = this.max();
        podium[1] = this.max2();
        podium[0] = this.max3();
        return podium;
    }
    
    public int max(){
        int max = 0;
        for (int i = 0; i < this.scores.length; i++){
            max = Math.max(this.scores[i], max);
        }
        return max;
    }
    
    public int max2(){
        int max2 = 0;
        for (int i = 0; i < this.scores.length; i++){
            if (this.max() >= this.scores[i] && i != this.getIOfMax()){
                max2 = Math.max(this.scores[i], max2);
            }
        }
        return max2;
    }
    
    public int max3(){
        int max3 =0;
        for (int i = 0; i < this.scores.length; i++){
            if (this.max2() >= this.scores[i] && i != this.getIOfMax2()){
                max3 = Math.max(this.scores[i], max3);
            }
        }
        return max3;
    }
    
    public int getIOfMax(){
        int j = 0;
        for (int i = 0; i < this.scores.length; i++){
            if (this.max() == this.scores[i]){
                j = i;
            }
        }
        return j;
    }
    
    public int getIOfMax2(){
        int j = 0;
        for (int i = 0; i < this.scores.length; i++){
            if (this.max2() == this.scores[i]){
                j = i;
            }
        }
        return j;
    }

 
}