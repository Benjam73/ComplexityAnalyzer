/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void echanger(int[]t, int val1, int val2){
        int temp=t[val1];   
        t[val1]=t[val2];
        t[val2]=temp;
    }
    public static int[] sortBubble(int[] tab) {
        int compt=1;
        while(compt!=0){
            compt=0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    echanger(tab,i,i+1);
                    compt=compt+1;
                }
            }
        }
        return(tab);
    }

}