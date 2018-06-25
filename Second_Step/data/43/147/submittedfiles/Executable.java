/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] list1={2,3,3,1,1,1,5,4,4,4,4,3,3,3,3,3};
    	IntegerProfile prof1=new IntegerProfile(list1);
    	System.out.println(""+prof1.sizeLongestPlateau());

    }
}