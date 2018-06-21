/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    int a =0;
    for(int i=0;i<tab.length;i++){
        for(int j=0;j<tab.length;j++){
        if(i!=j){  
    if(tab[i]==-tab[j]){
        a=a+1;
    }
        }
} 
}return a/2;
}

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
     
    public static int fastNumberOfCancellations(int[] tab) {
int a =0;
    for(int i=0;i<tab.length;i++){
        for(int j=0;j<tab.length;j++){
            if(i!=j){
    if(tab[i]==-tab[j]){
        a=a+1;
    }
            }
} 
}return a/2;
    }


}