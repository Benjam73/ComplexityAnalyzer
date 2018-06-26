/**
 * A class to represent the reactor planner.
 */
public class ReactorPlanner {

    /**
     * A table of integers to model the profit for each time period
    **/
    private int[] p;
    
    /**
     * Constructor by data 
     ***/
    public ReactorPlanner(int[] p) {
        this.p = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            this.p[i] = p[i];
        }
    }
    
    /**
     * returns the maximum profit
     **/
    public int maxProfit(){
        //TODO
        int[]sommes=new int [this.p.length];
        int max=p[0];
        for (int i=0;i<this.p.length;i++){
            int s=p[i];
            int max1=p[i];
            int[] sum=new int[this.p.length-i];
            sum[0]=s;
            if (i!=this.p.length-1){
                for (int j =i+1;j<this.p.length;j++){
                    s=s+p[j];
                    sum[j-i]=s;
                }
            }
            for (int k=0;k<sum.length;k++){
                if (max1<sum[k]){
                    max1=sum[k];
                }
            }
        sommes[i]=max1;
        }
        for (int i=0;i<this.p.length;i++){
            if(sommes[i]>max){
                max=sommes[i];
            }
        }
        return max;
    }

 
}