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
    public static void echanger(int []t,int a, int b){
        int temp = t[a];
        t[a]=t[b];
        t[b]=temp;
    }
    public static void trier(int[] t){
        int n = t.length;
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int k =i+1;k<n;k++){
                if (t[k]<t[min]){
                    min=k;
                }
            }
            echanger(t,min,i);
        }
    }
        

    public int[] podium(){
        int[] podium = new int[3];
        trier(scores);
        int n=scores.length;
        int a = scores[n];
        int b = scores[n-1];
        int c = scores[n-2];
        podium[0]= c;
        podium[1]=b;
        podium[2]=a;
        return podium;
        
        
    }

 
}