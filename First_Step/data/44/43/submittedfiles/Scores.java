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
    public int[] sortBubble(int[] scores){
    	int [] tab = scores;
    	for (int i=0; i<tab.length-1 ; i++){
            for (int j=i+1; j<tab.length ; j++){
                if (scores[i]>tab[j]){
                    int tps = tab[i];
                    tab[i]=tab[j];
                    tab[j]=tps;
                }
            }
        }
        return tab;
    }
    
    
    public int[] podium(){
        int[] podium = new int[3];
        //TODO
        int [] trie = this.sortBubble(scores);
        podium[2]=trie[trie.length-1];
        podium[1]=trie[trie.length-2];
        podium[0]=trie[trie.length-3];
        return podium;
    }
     
}