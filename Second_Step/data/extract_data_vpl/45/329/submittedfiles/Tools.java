/**
 * A class providing a static method for sorting.
 */
public class Tools {
    
   

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static int[] sortBubble(int[] tab) {
    
    int temp;
    boolean fin=true;
    
    while(fin) {
        fin=false;
            for(int i=0;i<=tab.length-2;i++) {
                if(tab[i]>tab[i+1]) {     // echange les cases i et i+1 du tableau
                    temp=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=temp;
                    fin=true;
                    
                        }
                 }  
            }
            return tab;
        }
    
    }
   