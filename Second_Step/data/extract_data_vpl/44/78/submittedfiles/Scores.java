/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    
    public int[] podium(){
 
        int[] result=new int[3];
        int[] a=this.scores;
        int n=this.scores.length;
            
        for(int i=1;i<4;i++){
            int tmp;
            for(int j=0;j<n-1;j++){
                if (a[j]>a[j+1]){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    
        result[0]=a[n-3];
        result[1]=a[n-2];
        result[2]=a[n-1];
        return result;       
    }
}
  