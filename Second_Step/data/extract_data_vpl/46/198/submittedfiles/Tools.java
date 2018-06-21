public class Tools {
    public static int numberOfCancellations(int[] tab) {
        int k=0;
        for(int i=0; i<tab.length; i++){
            for(int j=i+1; j<tab.length; j++){
                if(tab[i]+tab[j]==0){
                    k++;
                }
            }
        }
        return k;
    }
    
    
    public static int fastNumberOfCancellations(int[] tab) {
       int k=0;
        for(int i=0; i<tab.length; i++){
            for(int j=i+1; j<tab.length; j++){
                if(tab[i]+tab[j]==0){
                    k++;
                }
            }
        }
        return k;
    }
}