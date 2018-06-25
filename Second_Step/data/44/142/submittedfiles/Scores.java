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
     
    public int podium1(){
        for (int i=0;i<this.scores.length-1;i++){
            if (this.scores[i]>=this.scores[i+1]){
                this.scores[i+1]=this.scores[i];
            }else{
                this.scores[i]=this.scores[i+1];
            }
        }
        return this.scores[this.scores.length-1];
    }
    
    public int podium2(){
        for (int i=0;i<this.scores.length;i++){
            if (this.scores[i]==this.podium1()){
                this.scores[i]=0;
            }
        }
        for (int i=0;i<this.scores.length-1;i++){
            if (this.scores[i]>=this.scores[i+1]){
                this.scores[i+1]=this.scores[i];
            }else{
                this.scores[i]=this.scores[i+1];
            }
        }
        return this.scores[this.scores.length-1];
    }
    
        public int podium3(){
        for (int i=0;i<this.scores.length-1;i++){
            if (this.scores[i]==this.podium1() || this.scores[i]==this.podium2()){                
                this.scores[i]=0;
            }
        }
        for (int i=0;i<this.scores.length-1;i++){
            if (this.scores[i]>=this.scores[i+1]){
                this.scores[i+1]=this.scores[i];
            }else{
                this.scores[i]=this.scores[i+1];
            }
        }
        return this.scores[this.scores.length-1];
    }
    
    
    
    public int[] podium(){
        //TODO
        int[] a = new int[3];
        a[0]=this.podium3();
        a[1]=this.podium2();
        a[2]=this.podium1();
        return a;
        
    }

 
}