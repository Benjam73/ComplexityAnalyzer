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
    
     public static int[] sortBubble(int[] tab) {
        
        int n = tab.length;
        for( int i =0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                }
            }
        }
        return tab;
    }
    
    public static void swap(int [] t, int a, int b){
        int temp=t[a];
        t[a]=t[b];
        t[b]=temp;
    }
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
     
    public int[] podium(){
        //TODO
        
        int[] podium= new int[3];
        Scores.sortBubble(scores);
        int n=this.scores.length;
        podium[2]=scores[n-1];
        podium[1]=scores[n-2];
        podium[0]=scores[n-3];
        
        return podium;
    }

 
}