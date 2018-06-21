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
        Boolean t=true;
        int[] table=new int[3];
        int[] scor=this.scores;
        int n=scor.length;
        for (int i=0;i<n;i++){///Pourquoi commencer à deux ?
        	int k=i;
            int val=scor[i];
            while (k>=1 && val<scor[k-1]){
                scor[k]=scor[k-1];
                k=k-1;
            }
            scores[k]=val;
        }
        table[0]=scor[scor.length-3];
        table[1]=scor[scor.length-2];
        table[2]=scor[scor.length-1];
        return table;
    }

 
}