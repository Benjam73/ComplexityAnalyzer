/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[]p=new int[5];
        IntegerProfile t=new IntegerProfile(p);
        System.out.println(t.sizeLongestPlateau());

    }
}