/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        IntegerProfile a = new IntegerProfile(new int[]{2,4,4,1,1,3,3,3,3});
        System.out.println(a.sizeLongestPlateau());
    }
}