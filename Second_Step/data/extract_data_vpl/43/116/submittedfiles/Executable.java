/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        int[] prof = {1,2,3,3,3,3,3,4,4,4,5,6};
        IntegerProfile ip = new IntegerProfile (prof);
        
        System.out.println("the size of the longest plateau is : " +ip.sizeLongestPlateau());

    }
}