/**
 * A class providing a static method for sorting.
 */
public class Tools {

    //private int[]tab;
    
    //public Tools(int[]tab){
        //this.tab = new int[tab.length];
        //for(int i=0;i<tab.length;i++){
            //this.tab[i]=tab[i];
        //}
    //}

    public static void swap(int[]tab,int i, int j){
        int temp = tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }
    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n = tab.length;
        for(int i=0;i<n-1;i++){
            for(int j =0; j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    swap(tab,j,j+1);
                }
                
            }
        }return(tab);
    }

}