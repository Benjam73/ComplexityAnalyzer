/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int nbPaire = 0;
        for(int i=0;i<tab.length;i++){
            for(int j=i+1;j<tab.length;j++){
                if(tab[i]==-tab[j]){
                    nbPaire +=1;
                }
            }
        }
        return nbPaire;
    
    }
    
    public static int[] fusion (int [] t1, int[] t2){
        int n = t1.length + t2.length;
        int[]tab = new int[n];
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; i<n;i++){
            if(pos1<t1.length && (pos2==t2.length || t1[pos1] < t2[pos2])){
                tab[i]=t1[pos1];
                pos1++;
            }
            else {
                tab[i]=t2[pos2];
                pos2++;
            }
        }
        return tab;
    }
    
    public static int [] triFusion(int[]t){
        int n = t.length;
        if(n>1){
            int[]tg=new int[(n/2)];
            for (int i=0; i<(n/2);i++){
                tg[i]=t[i];
            }
            int[]td=new int[(n/2)];
            for (int i=0; i<(n/2);i++){
                td[i]=t[(n/2)+i];
            }
            tg=triFusion(tg);
            td=triFusion(td);
            return fusion(tg,td);
            
        }
        else{
            return t;
        }
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        boolean change=true;
        while(change){
            change=false;
            for(int i =0;i<tab.length-1;i++){
                if(tab[i]>tab[i+1]){
                    int temp=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=temp;
                    change=true;
                }
            }
        }
        int i=0;
        int nbPaire=0;
        int j = tab.length-1;
        while(i<j){
            if(tab[i]+tab[j]==0){
                nbPaire ++;
                i++;
                j--;
            }
            else{
               if(tab[i]+tab[j]>0){
                   j--;
               } 
               else{
                   i++;
               }
            }
        }
        return nbPaire;
    }


}