/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] board = {2, 3, 3, 1, 1, 1, 1, 3, 3};
	    IntegerProfile profile = new IntegerProfile(board);
	    System.out.println("Size of the longest plateau of the profile : " + profile.sizeLongestPlateau());
    }
}