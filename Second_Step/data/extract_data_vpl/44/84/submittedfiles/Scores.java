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
    
    //Méthode renvoyant le maximum du tableau
    public int max(int[]scores){
        int n = scores.length;
        int max = scores[0];
        for (int i=1 ; i<n ; i++){
            if (scores[i]>max){
                max=scores[i];
            }
        }
        return max;
    }
    
    //Méthode renvoyant la position du maximum du tableau
    public int positionMax(int[]scores){
        int n = scores.length;
        int max = scores[0];
        int pos = 0;
        for (int i=1 ; i<n ; i++){
            if (scores[i]>max){
                max=scores[i];
                pos=i;
            }
        }
        return pos;
    }
    
    //Méthode pour remplacer l'élément en position pos par 0
    public void remplacer(int[]scores,int pos){
        scores[pos]=0;
    }
     
    public int[] podium(){
        int n=scores.length;
        int podium [] = new int[3];
        for (int i=0 ; i<3 ; i++){
            podium[2-i]=max(scores);
            remplacer(scores,positionMax(scores));
        }
        return podium;
    }

 
}