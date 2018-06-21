/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] board = {1,8,5,7,3,19,64,05,173,905,23,587,2,435,35,64,245,46};
	    Scores scores = new Scores(board);
	    System.out.println("Podium : " + scores.toStringPodium());
    }
}