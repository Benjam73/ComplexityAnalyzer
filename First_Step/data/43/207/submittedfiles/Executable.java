/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] prof = {1,2,2,2,3,3,3,3,3,4,5,6,6,6};
    	IntegerProfile test1 = new IntegerProfile (prof);
    	System.out.println("[1,2,2,2,3,3,3,3,3,4,5,6,6,6] a pour plateau le plus long : "+test1.sizeLongestPlateau());
    	int[] prof2 = {1,2,2,3,3,3,4,5,6,6,6};
    	IntegerProfile test2 = new IntegerProfile (prof2);
    	System.out.println("[1,2,2,3,3,3,4,5,6,6,6,6] a pour plateau le plus long : "+test2.sizeLongestPlateau());

    }
}