/**
 * A class to manipulate a set of scores.
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] results;
    
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] scores) {
        this.results = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            this.results[i] = scores[i];
        }
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public static void swap(int [] tab, int i, int j){
        int a = tab[i];
        tab[i] = tab[j];
        tab[j] = a;
    }

    public int[] podium (){
        
        int n = this.results.length; // n = longueur du tableau results
        
        for (int i = 0; i < n-1; i++){ // on range le tableau dans l'odre croissant avec un bubblesort
            for (int j = 0; j < n-1-i; j++){
                if(this.results[j] < this.results[j+1]){
                    swap(this.results, j, j+1);
                }
            }
        }
        
        int[] liste = new int[3]; // on classe les 3 premiers dans la liste par odre décroissant
        for (int k = 0; k < 3; k++){
            liste[k] = this.results[2-k];
        }
        return liste;
    }
 
}