/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tab = {2, 3, 3, 1, 1, 1, 5, 3, 3} ;
        IntegerProfile prof = new IntegerProfile(tab) ;
        System.out.println("Le plateau de ce tableau est " + prof.sizeLongestPlateau()) ;
    }
}
