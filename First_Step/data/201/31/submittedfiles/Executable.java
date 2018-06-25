/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] board = {2,1,1,3,1,2};
	    Towers tours = new Towers(board);
	    System.out.println("Quantité d'eau : " + tours.water());
    }
}