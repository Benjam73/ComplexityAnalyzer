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
        int[]trie=BubbleSort(scores);
        int n=trie.length;
        int first = trie[n-1];
        int second =trie[n-2];
        int third =trie[n-3];
        int[]podium = new int[3];
        podium[0]=third;
        podium[1]=second;
        podium[2]=first;
        return podium;
    }
    public static int[] BubbleSort(int[] tab) {
        boolean notSorted=true;
        while(notSorted){
            notSorted=false;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    swap(tab, i, i+1);
                    notSorted=true;
                }
            }
        }
        return tab;
    }
      public static void swap(int[]t, int idx1, int idx2){
        int temp=t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    } 
}