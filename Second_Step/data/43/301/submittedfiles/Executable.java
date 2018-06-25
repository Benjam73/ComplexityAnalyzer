/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
    	int [] pro={2,3,3,1,1,1,5,4,4,4,4,4,3,3,3};
    	IntegerProfile p1=new IntegerProfile(pro);
    	
    	System.out.println(p1.sizeLongestPlateau());
    	
    }
}