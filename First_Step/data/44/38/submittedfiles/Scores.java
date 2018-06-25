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
        int deus;
        int max=scores[0];
        int min=scores[0];
        for(int j=1;j<=2;j++){
            if(scores[j]>max){
                max=scores[j];
                int indmax=j;
            }    
            else if(scores[j]<min){
                min=scores[j];
                int indmin=j;
            }
            }
        int prems=max;
        int trois=min;
        if(prems==scores[0]){
            if(trois==scores[1]){
                deus=scores[2];   
            }else{
                deus=scores[1];
            }
        }
        else if(prems==scores[1]){
            if(trois==scores[2]){
                deus=scores[0];   
            }else{
                deus=scores[2];
            }    
        }else{
            if(trois==scores[1]){
                deus=scores[0] ;  
            }else{
                deus=scores[1];
            }    
        }
        for(int i=1;i<scores.length;i++){
            if(scores[i]>prems){
                trois=deus;
                deus=prems;
                prems=scores[i];
            }else if(scores[i]>deus && scores[i]<=prems){
                trois=deus;
                deus=scores[i];
            }else if(scores[i]>trois && scores[i]<=deus){
                trois=scores[i];
            }
            
        }
        int[] podium=new int[3];
        podium[2]=prems;
        podium[1]=deus;
        podium[0]=trois;
        
        return (podium) ;
    }

 
}