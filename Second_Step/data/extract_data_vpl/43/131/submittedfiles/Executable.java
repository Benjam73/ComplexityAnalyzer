/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] values = new int [6];
        values[0] = 2;
        values[1] = 2;
        values[2] = 2;
        values[3] = 4;
        values[4] = 6;
        values[5] = 6;
        
        IntegerProfile test = new IntegerProfile(values);
        System.out.println(test.sizeLongestPlateau());

    }
}