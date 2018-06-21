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
     
     public int bigger(){
         int c=0;
         int position=0;
         for (int i=0; i<scores.length;i++){
           if(c>scores[i]){
            }
            else{
                c=scores[i];
                position=i;
            }
         }
         return c;
     }
    public int[] podium(){
        //TODO
        int size=scores.length;
        int c=0;
        int d=0;
        int e=0;
        int position=0;
        int[] compt = new int[3];
        int[] tamp = scores;
               for (int i=0; i<tamp.length;i++){
           if(c>tamp[i]){
            }
            else{
                c=tamp[i];
                position=i;
            }
         }
         compt[2]=c;
         tamp[position]=0;
      for (int i=0; i<tamp.length;i++){
           if(d>tamp[i]){
            }
            else{
                d=tamp[i];
                position=i;
            }
         }
         compt[1]=d;
         tamp[position]=0;
         for (int i=0; i<tamp.length;i++){
           if(e>tamp[i]){
            }
            else{
                e=tamp[i];
                position=i;
            }
         }
         compt[0]=e;
         tamp[position]=0;
        return compt;
    }

 
}