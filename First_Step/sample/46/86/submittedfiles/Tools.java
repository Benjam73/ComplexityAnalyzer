import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int n = tab.length;
        int compteur = 0;
        for (int i = 0; i < n; i++){

            for(int j =0;j<n;j++){
                if (tab[i]+tab[j]==0&&tab[i]!=0&&tab[j]!=0&&i!=j){
                    compteur++;
                    tab[i]=0;
                    tab[j]=0;
                }
            }
        }
        return compteur;

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
        Arrays.sort(tab);
        //Tools.sortBubble(tab);
        int n = tab.length;
        int compteur = 0;
        for (int i =0; i<n-1;i++){
            for (int j = i+1; j<n;j++){
                if(tab[i] + tab[j]==0){
                    compteur ++;
                    
                }
            }
        }
        return compteur;
    }
    //public static void sortBubble(int[] tab) {
      //  boolean tab_en_ordre = false;
        //int taille = tab.length;
        //while(!tab_en_ordre){
          //  tab_en_ordre = true;
            //for(int i=0 ; i < taille-1 ; i++){
              //  if(tab[i] > tab[i+1]){
                //    swap(tab,i,i+1);
                  //  tab_en_ordre = false;

            //    }
          //  }
        //    taille--;
      //  }
    //}
    
    public static void swap(int[]tab, int i, int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

}

