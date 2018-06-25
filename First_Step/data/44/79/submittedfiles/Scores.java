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
    
    public int max(int a, int b){
        int max=0;
        int k = 0;
            for(int i=0; i<this.scores.length;i++){
                if(this.scores[i]>max&&i!=a&&i!=b){
                    max=this.scores[i];
                    k=i;
                }
            } 
        return k;    
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        //TODO
        
        int podium[] = new int [3];
            int l=-1;
            int m=-1;
            
        for(int k = 2; k>=0;k--){
        
            
            if(k==2){
                l = this.max(l,m);
                podium[k]=this.scores[l];
            }
            if(k==1){
                m = this.max(l,m);
                podium[k]=this.scores[m];
            }
            if(k==0){
                podium[k]=this.scores[max(m,l)] ;  
            }
        }
        return podium;
    }

 
}