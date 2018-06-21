/**
 * A class to represent the reactor planner.
 * @author hadrien cambazard
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
        /*** 1ère méthode en complexité carrée***/
        /*int n=this.p.length;
        int[] tab = new int[this.p.length];
        for ( int i =0; i< n; i++){
            int maxp= this.p[i];
            int som = this.p[i];
            for (int j= i+1; j<n;j++){
                som=som+this.p[j];
                if( maxp < som){
                    maxp=som;
                }
            }
            tab[i]=maxp;
        }
        return maxSet(tab);*/
        /***2ème méthode e complexité carrée***/
        /*int n = p.length;
        if ( n==0){
            return 0;
        }else{
            int maxSum =0;
            int sumI=0;
            for ( int i = 0; i<n; i++){
                sumI= sumI+p[i];
                int j = i+1;
                while ( j< n && sumI> 0){
                    sumI=sumI+p[j];
                    if ( sumI> maxSum){
                        maxSum= sumI;
                    }
                    j=j+1;
                }
                sumI=0;
            }
            return maxSum;
        }*/
        /***méthode en complexité linéaire***/
        int n = this.p.length;
        int[]tab= new int [n];
        tab[0]=Math.max(this.p[0],0);
        int max = tab[0];
        for ( int i = 1; i<n; i++){
            tab[i]=Math.max(tab[i-1]+p[i], 0);
            if (tab[i]> max){
                max= tab[i];
            }
            
        }
        return max;
    }
    public int maxSet(int []tableau){
        int n = tableau.length;
        int max = tableau[0];
        for (int i =1; i<n;i++){
            if(max<tableau[i]){
                max=tableau[i];
            }
        }
        return max;
    }

 
}