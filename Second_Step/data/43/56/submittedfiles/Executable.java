/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] s = {1,3,3,3,5,3,9,9,4,4,4,4};
		IntegerProfile x = new IntegerProfile(s);
		System.out.println(x.sizeLongestPlateau());
		System.out.println(x.sizeLongestPlateau());
    }
}