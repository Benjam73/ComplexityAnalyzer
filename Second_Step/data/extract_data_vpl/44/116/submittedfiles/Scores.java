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
        //TODO
        int [] pod = new int[3];
        int [] tab = Trier(this.scores);
        int n= this.scores.length;
        pod[2]= tab[n-1];
        pod[1]= tab[n-2];
        pod[0]= tab[n-3];
        return pod;
        
        
    }
    private void insert(int x, int[]tab, int leftsize){
        for(int j= leftsize; j> 0 ;j--){
            if(tab[j-1]> x){
                tab[j]=tab[j-1];
            int i =j-1;
        tab[i]=x;
    
            }
        }
    }
    private int[] Trier(int [] tableau ){
        int n = tableau.length;
        for(int t= 1; t< n ; t++ ){
            insert(tableau[t],tableau ,t);
        }
        return tableau ;
    }
 
}