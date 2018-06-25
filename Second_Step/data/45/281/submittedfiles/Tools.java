/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
    public static void swap(int[] table, int case1, int case2){
        int temp = table[case1];
        table[case1] = table[case2];
        table[case2] = temp;
    }
    
    int [] tab ;

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] table) {
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table.length-1; j++){
                if(table[j]>table[j+1]){
                    swap(table, j , j+1);
                }
            }
        }
    return table;  
    }

}