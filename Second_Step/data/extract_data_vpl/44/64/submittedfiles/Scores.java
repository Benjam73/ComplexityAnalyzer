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
        int[] monTableau=new int[3];
        if(this.maximum()[1]>=3){
            for(int i=0;i<=2;i++){
                monTableau[i]=this.maximum()[0];
            }
        }else if(this.maximum()[1]==2){
            monTableau[0]=this.maximum2()[0];
            monTableau[1]=this.maximum()[0];
            monTableau[2]=this.maximum()[0];
        }else{
            if(this.maximum2()[1]>=2){
                monTableau[0]=this.maximum2()[0];
                monTableau[1]=this.maximum2()[0];
                monTableau[2]=this.maximum()[0];
            }else{
                monTableau[0]=this.maximum3();
                monTableau[1]=this.maximum2()[0];
                monTableau[2]=this.maximum()[0];
            }
        }
        return(monTableau);
        
    }
    
    //Retourne la valeur du maximum, puis le nb de maxima présents.
    public int[] maximum(){
        int[] maxTableau=new int[2];
        int max=this.scores[0];
        int nb=1;
        for(int i=1;i<this.scores.length;i++){
            if(this.scores[i]==max){
                nb+=1;
            }else if(this.scores[i]>max){
                max=this.scores[i];
                nb=1;
            }
        }
        maxTableau[0]=max;
        maxTableau[1]=nb;
        return(maxTableau);
    }
    
    
    //Retourne la valeur du 2e max, puis le nb de 2e max présents.
    public int[] maximum2(){
        int[] maxTableau=new int[2];
        int max2=this.scores[0];
        int nb=1;
        for(int i=1;i<this.scores.length;i++){
            if(max2<this.scores[i] && this.scores[i]<this.maximum()[0]){
                nb=1;
                max2=this.scores[i];
            }else if(this.scores[i]==max2){
                nb+=1;
            }
        }
        maxTableau[0]=max2;
        maxTableau[1]=nb;
        return(maxTableau);
    }
    
    public int maximum3(){
        int max3=this.scores[0];
        for(int i=1;i<this.scores.length;i++){
            if(max3<this.scores[i] && this.scores[i]<this.maximum2()[0]){
                max3=this.scores[i];
            }
        }
        return(max3);
    }
    
    

 
}