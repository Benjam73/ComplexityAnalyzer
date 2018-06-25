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
        int n = tab.length;
        int k = n-1;
        boolean trie=false;
        while (trie == false && k>0){
            trie= true;
            for (int i=0;i<k;i++){
                if (tab[i]>tab[i+1]){
                    int a=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;
                }
            }
            k=k-1;
        }
        System.out.println(tab);
    }

}

        public int[] selection(int[]tab){
            int n=tab.length;
            for(i=0;i<n-1;i++){
                int mimn=i;
                for(int k=i+1;k<n;k++){
                    if(tab[k]<tab[min]){
                        min=k;
                    }
                }
                echanger(tab,min,i)
            }
        }
        
        public static void triInsertion(int[] tab){
            int n =tab.length);
            for(int i=1;i<n;i++){
                int k=i;
                int val=tab[i];
                while(k>=1 && val<tab[k-1]){
                    tab[k]=tab[k-1];
                    k=k-1;
                }
                tab[k]=val
            }
        }