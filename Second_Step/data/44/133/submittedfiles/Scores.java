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
    public int max(){
        int max =scores[0];
        for (int i=1; i<scores.length;i++){
            if (scores[i]>max){
                max=scores[i];
            }
        }
        return max;
    }
    
    public int posmax(){
        int max =scores[0];
        int pos =0;
        for (int i=1; i<scores.length;i++){
            if (scores[i]>max){
                max = scores[i];
                pos = i;
            }
        }
        return pos;

    }   
        
    
    public int[] podium(){
        //TODO
        int[] popo = new int[3];
        int premier =0;
        int deuxieme =0;
        int troisieme =0;
        
        premier = this.max(); ///<hadrien> this.scores est un tableau d'entiers.
        int x =this.posmax(); /// Est ce qu'un tableau d'entiers fournit un service posmax() ???
        scores[x]=0;                 /// c'est this.posmax() que tu veux appeler je pense.
        
        deuxieme = this.max();
        int y = this.posmax();
        scores[y]=0;
        
        troisieme = this.max();
        int z = this.posmax();
        scores[z]=0;
        
        popo[0]=troisieme;
        popo[1]=deuxieme;
        popo[2]=premier;
        
        return popo;
        
    }
}