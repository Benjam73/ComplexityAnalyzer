/**
 * A class to perform your own tests
 */
public class Executable {
    public static int[] swap(int[] tab, int i, int j){
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
        return tab;
    }
    
    public static int[] Sort(int[] tab){
        for(int i =0; i<tab.length; i++){
            for(int j =0; j<tab.length-1; j++){
                if(tab[j]<tab[j+1]){
                    swap(tab,j,j+1);
                }
            }
        }
        return tab;
    }
    
    public static void main(String[] args) {

    int[] table = {2,4,3,5,76,5};
    Scores score = new Scores(table);
    int[] sorted = Sort(table);
    int[] top3 = score.podium();
    for(int i = 0; i<top3.length; i++){
        System.out.println(top3[i]);
    }
}
}