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
    
    public void echanger(int [] tab, int min, int i){
        int k = tab[min];
        tab[min] = tab[i];
        tab[i] = k;
    }
    
    public int[] triSelection(int [] tab){
        int[] temp = new int[tab.length];
        temp = tab;
        int n = tab.length;
        for ( int i = 0; i<n-1;i++){
            int min = i;
            for ( int k = i+1; k <n; k++){
                if (tab[k]<tab[min]){
                    min = k;
                }
            }
            echanger(tab,min,i);
        }
        return temp;
    } 
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int[] Podium = new int [3];
       int[] podInit = new int[this.scores.length];
        podInit = triSelection(this.scores);
        Podium[0] = podInit[podInit.length - 3];
        Podium[1] = podInit[podInit.length - 2];
        Podium[2] = podInit[podInit.length - 1];
        return Podium;
    }

 
}