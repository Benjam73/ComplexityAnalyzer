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
     
    public int[] bubble(int[] tab){
        int temp = 0;
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab.length-1;j++){
                if(tab[j]>tab[j+1]){
                   temp = tab[j+1];
                   tab[j+1]=tab [j];
                   tab[j]=temp;
                   temp=0;
                }
            }
            }
            return tab;
        
    }
    
    public int[] podium(){
       int[] p = new int[3];
       int[] d = bubble(scores);
       for(int i = 0; i<p.length;i++){
           p[i] = d[d.length-3+i];
       }
       return p;
    }

 
}