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
    
public int[] swap(int[] tab, int i, int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
        return tab;
    }
    
    public int[] Sort(int[] tab){
        for(int i =0; i<tab.length; i++){
            for(int j =0; j<tab.length-1; j++){
                if(tab[j]<tab[j+1]){
                    swap(tab,j,j+1);
                }
            }
        }
        return tab;
    }
     
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
     
    public int[] podium(){
        int[] top3 = new int[3];
        int[] sortedTab = Sort(scores);
        top3[2] = sortedTab[0];
        top3[1] = sortedTab[1];
        top3[0] = sortedTab[2];
        return top3;
    }
    
 
}