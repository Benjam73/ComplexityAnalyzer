/**
 * A class providing a static method for sorting.
 */
public class Tools {
     
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    int t=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=t;
                }
            }
        }
        return(tab);
    }
}