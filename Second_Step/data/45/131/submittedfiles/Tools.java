/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    private int[]tab;
    
    public Tools(int[]tab){
    this.tab=new int[tab.length];
        for(int i=0;i<tab.length;i++){
            this.tab[i]=tab[i];
        }
    }
   
    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[]tab){
        int memoire=0;
        int i=0;
        boolean dejatrie=false;
        while(i<tab.length-1 && dejatrie==false){
            dejatrie=true;
            for(int j=0;j<tab.length-1-i;j++){
                if(tab[j]>tab[j+1]){
                    memoire=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=memoire;
                    dejatrie=false;
                }
            }
            i++;
        }
    }
}