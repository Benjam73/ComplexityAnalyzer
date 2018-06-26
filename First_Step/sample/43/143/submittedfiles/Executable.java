/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] p = {2,3,1,1,1,1,5,3};
    	IntegerProfile prof = new IntegerProfile(p);
    	System.out.println(prof.sizeLongestPlateau());

    }
}