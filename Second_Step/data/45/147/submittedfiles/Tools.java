/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    private int[] tab;
    
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     * 
     */

    public static void echanger(int[]tab, int idx1, int idx2){
        int temp=tab[idx1];
        tab[idx1]=tab[idx2];
        tab[idx2]=temp;
    }
    public static void sortBubble(int[] tab) {

    int n= tab.length-1;
    boolean dejatrie = false;
    while(n>0&&!dejatrie){
        dejatrie=true;
        for (int i=0; i<n;i++){
            if(tab[i]>tab[i+1]){
                echanger(tab,i,i+1);
                
                dejatrie=false;
            }
        }
        n-=1;
    }
    
    }
}

/**
while(i<n-1 && !dejatrie){
     dejatrie = true;
        for (int j=0; j<n-1-i; j++){
            if (tab[j]>tab[j+1]){
             echanger(tab, j, j+1);
             dejatrie=false;
            }
        }
       i=i+1; 
    }
    }
         */
