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
        //TODO
        int x1=0;
        int x2=0;
        int x3=0;
        int x11=0;
        int x22=0;
        int x33=0;
        int k=0;
        int l=0;
        int m=0;
        int[] pod=new int[3];
        pod[0]=x1;
        pod[1]=x2;
        pod[2]=x3;
        for(int i=0;i<this.scores.length-1;i=i+1){
            x1=Math.max(this.sores[i],this.scores[i+1]);
            if(x1>x11&&this.scores[i]>=this.scores[i+1]){k=i;}
            else if(x1>x11&&this.scores[i]<this.scores[i+1]){k=i+1;}
            x11=Math.max(x11,x1);}
        
        int[] pop=new int[this.scores.length];
        for(int i=0;i<k;i=i+1){
            pop[i]=scores[i];
        }
        for(int i=k+1;i<=this.scores.length-1;i=i+1){
            pop[i]=scores[i];}
        pop[k]=0;
        
        for(int i=0;i<this.scores.length-1;i=i+1){
            x2=Math.max(this.pop[i],this.pop[i+1]);
            if(x2>x22&&this.pop[i]>=this.pop[i+1]){l=i;}
            else if(x2>x22&&this.pop[i]<this.pop[i+1]){l=i+1;}
            x22=Math.max(x2,x22);}
            
        int[] poo=new int[this.scores.length];
        for(int i=0;i<Math.min(k,l);i=i+1){
            poo[i]=scores[i];
        }
        for(int i=Math.min(k,l);i<Math.max(k,l);i=i+1){
            poo[i]=scores[i];
        }
        for(int i=Math.max(k,l);i<=this.scores.length;i+1){
            poo[i]=scores[i];
        }
        poo[k]=0;
        poo[l]=0;
        
        for(int i=0;i<this.scores.length-1;i=i+1){
            x3=Math.max(this.poo[i],this.poo[i+1]);
            if(x3>x33&&this.poo[i]>=this.poo[i+1]){m=i;}
            else if(x3>x33&&this.poo[i]<this.poo[i+1]){m=i+1;}
            x33=Math.max(x33,x3);}
            
            
        }
    }

 
}