/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void echanger(int i,int j, int[] t){
         int a=0;
         a= t[i];
         t[i]=t[j];
         t[j]=a;
     }
    

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        for(int i=0;i<tab.length-1;i++){
            for(int j=0;j<tab.length-1;j++){
                if(tab[j]>=tab[j+1]){
                 echanger(j,j+1,tab);
                }
                
            }
        }
        return tab;
        
    }

}