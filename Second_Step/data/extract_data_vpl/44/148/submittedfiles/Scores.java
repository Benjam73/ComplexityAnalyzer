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
    int compteur1=0;
    int compteur2=0;
    int [] answer = new int [3];
    for (int i=0; i<3; i++){
    answer[i]=0;
    }
    for( int i=0; i<scores.length;i++){
        if (answer[2]<scores[i]){
            answer[2]=scores[i];
            compteur1=i;
        }
    }
    int j=0;
    while (j<scores.length){
        if (answer[1]<scores[j] && compteur1!=j){
        answer[1]=scores[j];
        compteur2=j;
        j++;
        }
        else {j++;
        }
        }
    
    int k=0;
    while (k<scores.length){
        if (answer[0]<scores[k] && compteur2!=k && compteur1!=k ){
        answer[0]=scores[k];
        k++;
        }
        else {k++;
        }
    }
    return answer;
    }

 
}