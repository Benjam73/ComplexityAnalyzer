/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        boolean ech = true;
        while (n>0 && ech==true){
            ech=false;
            for(int i=0;i<n-1;i++){
                if(tab[i]>tab[i+1]){
                    echanger(tab,i,i+1);
                    ech=true;
                }
            }
            n--;
        }
        return tab;
    }
    
    public static void echanger(int [] t, int idx1, int idx2){
        int temp = t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    }
        
    
    

}