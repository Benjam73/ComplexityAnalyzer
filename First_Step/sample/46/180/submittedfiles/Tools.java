/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int x=0;
        for(int i=0;i<tab.length;i=i+1){
            for(int j=0;j<tab.length;j=j+1){
                if(tab[i]+tab[j]==0){
                    x=x+1;
                }
            }
        }
        return x/2;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int a=0;
        int pos=0;
        int neg =0;
        for(int i=0;i<tab.length;i=i+1){
            if(tab[i]>0){
                pos=pos+1;
            }
            else if(tab[i]<0){
                neg=neg+1;
            }
        }
        int[] x=new int[pos];
        int[] y=new int[neg];
        int u=0;
        int v=0;
        for(int i=0;i<tab.length;i=i+1){
            if(tab[i]>0){
                x[u]=tab[i];
                u=u+1;
            }
            else if(tab[i]<0){
                y[v]=tab[i];
                v=v+1;
            }
        }
        for(int i=0;i<x.length;i=i+1){
            for(int j=0;j<y.length;j=j+1){
                if(x[i]+y[j]==0){
                    a=a+1;
                }
            }
        }
        return a;
    }

}