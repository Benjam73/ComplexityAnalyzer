/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] board = {2,3,3,1,1,1,5,3,3}; 
        IntegerProfile profile = new IntegerProfile(board);
        System.out.println(profile.sizeLongestPlateau()); //devrait renvoyer 3
    }
}