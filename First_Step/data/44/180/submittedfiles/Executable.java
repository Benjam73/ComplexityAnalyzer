/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tableau = new int[5] ;
            tableau[0] = 1 ;
            tableau[1] = 4 ;
            tableau[2] = 4 ;
            tableau[3] = 4 ;
            tableau[4] = 1 ;

            
        Scores scores = new Scores(tableau) ;
        
        System.out.println(scores.podium()) ;
    }
}