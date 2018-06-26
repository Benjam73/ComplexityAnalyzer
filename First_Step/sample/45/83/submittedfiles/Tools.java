/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        while(n>1){
            for(int j=0;j<n-1;j++){
                if(tab[j]>tab[j+1]){
                    int temp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
            n=n-1;
        }
        return tab;
    }
    public static void main(String[] args) {
        
        int[] tab=new int[5];
        tab[0]=5;tab[1]=2;tab[2]=4;tab[3]=3;tab[4]=1;
        for(int i=0;i<tab.length;i++){
            System.out.println(sortBubble(tab)[i]);
        }
    }

}