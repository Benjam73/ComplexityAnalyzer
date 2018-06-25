/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int [] board = {1,1,2,2,2,2,2,2};
        IntegerProfile profile = new IntegerProfile(board);
        System.out.println(profile.sizeLongestPlateau());

    }
}