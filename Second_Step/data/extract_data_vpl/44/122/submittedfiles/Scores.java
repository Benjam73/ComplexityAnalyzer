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
        //TODO
        if(this.scores.length>=3){  // si il y a au moin 3 concurents
            int a=this.scores[0];
            
            
            int e=0;
            int[] max= new int[3]; 
            for(int k=1;k<this.scores.length;k++){ // je cherche le max
                if(this.scores[k]>a){
                    a=this.scores[k];
                    e=k;
                }
            }
        
            int d= 0;
            int f=0;
            while(d==e){
                d+=1;
            }
            int b=this.scores[d];
            d=0;
            while(d<this.scores.length){ // je cherche le 2e max: je cherche le max autre que celui trouvé
        // précédement
                if(d!=e){
                    if(this.scores[d]>b){
                        b=this.scores[d];
                        f=d;    
                    }
                }
                d+=1;
            }
        
            int g=0;
            while(g==e || g==f){
                g+=1;
            }
            int c=this.scores[g];
            g=0;
            while(g<this.scores.length){
                if(g!=e && g!=f){
                    if(this.scores[g]>c){
                        c=this.scores[g];
                    }
                }
            
            g+=1;
            }
            max[2]=a;
            max[0]=c;
            max[1]=b;
            return max;
        
        }else if(this.scores.length==2){
            int[] max= new int[2];
            max[0]=Math.max(this.scores[0],this.scores[1]);
            max[1]=Math.min(this.scores[0],this.scores[1]);
            return max;
        
        }else{ 
            return this.scores;
        }
    }
}