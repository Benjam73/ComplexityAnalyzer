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
        int [] podium = new int [3];
        podium[0] = max3() ;
        podium[1] = Max2() ;
        podium[2] = Max() ;
        
        return podium;
        
        
        
        //TODO
    }
    public int Max(){
        int n = this.scores.length;
        int max = 0;
        for (int i = 0 ; i < n ; i++){
            if ( this.scores[i] > max ){
                max = this.scores[i];
                
            }
            
        }
        return max;
    }
    public int Max2(){
        int n = this.scores.length;
        int max2 = 0;
        int max = Max();
        int g = indexmax1();
        for (int i = 0 ; i < n ; i++ ){
            if ( this.scores[i] > max2 && i!=g){
                max2 = this.scores[i];
            }
        }
        return max2;
    }
    
    public int max3(){
        int n = this.scores.length;
        int max3 = 0;
        int max = Max();
        int max2 = Max2();
        int g = indexmax1();
        int h = indexmax2();
        for (int i = 0 ; i < n ; i++ ){
            if ( this.scores[i] > max3 && i!=h && i!=g ){
                max3 = this.scores[i];
            }
        }
        return max3;
    }
    
    public int indexmax1(){
        int n = this.scores.length;
        int max = 0;
        int g = 0 ;
        for (int i = 0 ; i < n ; i++){
            if ( this.scores[i] > max ){
                max = this.scores[i];
                g = i ;
            }
            
        }
        return g;
        
    }
    public int indexmax2(){
        int n = this.scores.length;
        int max2 = 0;
        int max = Max();
        int g = indexmax1();
        int h = 0 ;
        for (int i = 0 ; i < n ; i++ ){
            if ( this.scores[i] > max2 && i!=g){
                max2 = this.scores[i];
                h = i ;
                
            }
        }
        return h;
        
    }
    
    
    
    
    
}