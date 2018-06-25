/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
   

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
     
    private static void echanger (int [] tab , int i , int j){
        int temp = tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }
    
    
/* VERSION 1 */ 
    
    public static void sortBubble(int[] tab) {
        for (int i=0 ; i<tab.length ; i++){
            for (int j=0 ; j<tab.length-1-i ; j++){
                if (tab[j]>tab[j+1]){
                    echanger (tab , j , j+1);
                }
            
                
            }
        }
    }
    
/* VERSION 2 : ne trie plus la liste à partir d'une étape k où la liste est déjà triée*/

    public static void sortBubble2(int[] tab){
        int n = tab.length;
        int i = 0;
        boolean dejatrie = false;
        while (i<n-1 && !dejatrie){ /* !dejatrie veut dire que dejatrie est false */
            dejatrie=true;
            for (int j=0 ; j<n-1-i ; j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab, j, j+1);
                    dejatrie=false;
                    }
                }
                i=i+1;
            }
    }
    
  /* QUESTION 4 
  
    public static int occurences(int[] tab , int val){
        int k=0;
        for (int i=0; i<tab.length ; i++){
            if (tab[i]==val){
                k=k+1;
            }
        }
        return k;    
    
    }
    
    public static int occurenceMax(int[] tab){
        int max=0;
        int occ=0;
        for (int i=0; i<tab.length; i++){
            if (occurences(tab,tab[i])>occ){
                occ=occurences(tab,tab[i]);
                max=tab[i];
            }
        
        }
        return max;
    }

    
    public static int fastOccurenceMax(int[] tab){
        if (tab.length==0){return 0;}
        Arrays.sort(tab);
        int maxFound = 1;
        int maxValue = tab[0];
        int currentCount = 1;
        for (int i=1; i<tab.length; i++){
            if (tab[i]==tab[i-1]){
                currentCount++;
                if (currentCount>maxFound){
                    maxFound=currentCount;
                    maxValue=tab[i];
                }
            }
        }
    }
    
    public static int reallyFastOccurenceMax(int[] tab){
        int [] count = new int [tab.length];
        for (int i=0; i<tab.length; i++){
            count[i]=0;
        }
        for (int i=0; i<tab.length; i++){
            count[tab[i]]++;
        }
        int maxFound=0;
        int value=0;
        for (int i=0; i<tab.length; i++){
            if(maxFound<count[i]){
                maxFound=count[i];
                value=i;
            }
        }
        return value;
    } */
    
    

}