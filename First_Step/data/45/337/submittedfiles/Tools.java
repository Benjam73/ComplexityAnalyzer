/**
 * A class providing a static method for sorting.
 */
public class Tools {

   
    public static int[] sortBubble(int[] tab) {
        int n=tab.length;
        int i=0;
        boolean dejatrie=false;
        while (i<n-1&&!dejatrie){
            dejatrie=true;
            for(int j=0; j<n-1-i;j++){
                if(tab[j]>tab[j+1]){
                    swap (tab,j,j+1);
                    dejatrie=false;
                }
            }
            i++;
        }
    }

}