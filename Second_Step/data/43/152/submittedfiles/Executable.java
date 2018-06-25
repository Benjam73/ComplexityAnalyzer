/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        
        int tab [] = {1,2,3,3,3,6,4,4};
        IntegerProfile a = new IntegerProfile(tab);
        System.out.println(a.sizeLongestPlateau()); //doit afficher 3
        
        int tab2 [] = {1,2,3,3,3,6,4,4,4,4};
        IntegerProfile b = new IntegerProfile(tab2);
        System.out.println(b.sizeLongestPlateau()); //doit afficher 4
        
        
    }
}