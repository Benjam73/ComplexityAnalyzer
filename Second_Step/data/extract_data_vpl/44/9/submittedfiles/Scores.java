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
    
    public static void echanger(int tableau[], int i, int j){
        int temporaire;
        temporaire = tableau[i];
        tableau[i] = tableau[j];
        tableau[j] = temporaire;
}
public static void triSelection( int[] tab){ 
        int n = tab.length ;
        for (int i = 0; i < n-1; i++) { 
            int min = i ;
                for ( int k = i+1 ; k < n ; k++) {
                    if (tab[k] < tab[min]) {
                    min = k;
    echanger(tab, min, i) ;
}
}
}
}
    public int[] podium(){
        triSelection(scores);
        int [] resultats = new int [3];
        resultats[0]=scores.length-2;
        resultats[1]=scores.length-1;
        resultats[2]=scores.length;
        return (resultats);
    }
}