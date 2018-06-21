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
        int[] pod= new int[3];
        int i=1;
        int ii=0;
        int j=1;
        int jj=0;
        int k=1;
        int kk=0;
        int s1=scores[0];
        int s2=scores[0];
        int s3=scores[0];
        while (i<scores.length){
            if (scores[i]>s1){
                s1=scores[i];
                ii=i;
                i++;
            }else{
                i++;
            }
        }pod[2]=s1;
        while (j<scores.length && j!=ii){
            if (scores[j]>s2 && scores[j]<pod[2]){
                s2=scores[j];
                jj=j;
                j++;
            }else{
                j++;
            }
        }pod[1]=s2;
        while (k<scores.length && k!=ii && k!=jj){
            if (scores[k]>s3 && scores[k]<pod[1]){
                s3=scores[k];
                kk=k;
                k++;
            }else{
                k++;
            }
        }pod[0]=s3;
        return pod;
    }    
 
}