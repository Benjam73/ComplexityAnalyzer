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
    public int[] podium(){
        int []trie = scores.triBulle();
        return (trie[trie.length()-3;trie.length()-1]);
        //scores [] pod = new scores[0:0:0];
        //pod = [trie[trie.length()-3,trie[trie.length()-2,trie[trie.length()-1)]
        //return (pod);
        //TODO
    }
    
    public static void triBulle(){
        int temp;
        int n=courses.length();
        int i=0;
        while (i<n-1){
            for (int j=0; j<n-1; j++){
                if (courses[j]>courses[j+1]){
                    temp = courses[j];
                    courses[j] = courses[j+1];
                    courses[j+1] = temp;
                }
            }
            i+=1;
        }
    }
 
}