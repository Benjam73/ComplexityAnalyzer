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
     public void echanger(int i,int j, int[] t){
         int a=0;
         a= t[i];
         t[i]=t[j];
         t[j]=a;
     }
    
     public void scoresOrdonnee(int[]scores){
        for(int i=0; i<scores.length;i++){
            if(scores[i]<scores[i+1]){
                echanger(i,i+1,scores);
            }
        }
        
     }
        

    public int[] podiums(int[]scores){
        scores[] = scoresOrdonnee(scores[]);
        int[]tab=new int[3];
        for(int i=0; i<tab.length;i++){
            tab[i]= new scores[2-i];
        }
        return tab;
    }
    

 
}