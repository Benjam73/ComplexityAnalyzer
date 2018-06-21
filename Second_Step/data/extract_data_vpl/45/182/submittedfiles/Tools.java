/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        //TODO  
        int n = tab.length;
        boolean notSort = true;
        int c=0;
        while(notSort){
            notSort=false;
            for(int i=0;i<n-1;i++){
                if (tab[i] > tab[i+1]){
                    int a = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = a;
                    
                    notSort=true;
                }
                c++;
            }
            
        }
    }
}
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(tab[j] > tab[j+1]){
                    int a = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = a;
                }
                
            }
        }
    }*/

