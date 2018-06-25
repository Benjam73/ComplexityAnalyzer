/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    private int[] resultats ;
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] scores) {
        this.scores = scores;
        this.resultats = new int[3];
        for(int i = 0 ; i<resultats.length ; i++){
            this.resultats[i] = scores[i] ;
        }
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        
        for(int i=1 ; i<scores.lenght -1; i++){
            this.ranger();
            if(this.scores[i] > this.resultats[0]){
                if(this.scores[i] > this.scores[1]){ 
                    this.echange(0,1); //si la valeur est plus grande que deux valeurs il va falloir sortir la première valeur 
                    if(this.scores[i] > this.scores[2]){
                        this.echange(1,2);
                        this.resultats[2] = this.scores[i];
                    }
                    
                    else{
                        this.resultats[1] = this.scores[i];
                }
            }
            else{
                this.resultats[0] = this.scores[i];
            }
        }
    }
    return this.resultats;
    }
    
    public void ranger(){ //permet de trier le tableau résultat au début
        if(this.resultats[0] > this.resultats[1]){
            this.echange(0,1);
            if(this.resultats[1] > this.resultats[2]){
                this.echange(1,2);
                if(this.resultats[0] > this.resultats[1]){
                    this.echange(0,1);
                }
            }
            }   
            }
        
    
        
    }
    public void echange(int a, int b){ //permet d'échanger deux valeurs dans le tableau résultat
        int tamp = this.resultats[a];
        this.resultats[a] = this.resultats[b];
        this.resultats[b] = tamp;
    }

 
}