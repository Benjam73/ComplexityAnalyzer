/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] b = new int[9];
        b[0] = 1;
        b[1] = 1;
        b[2] = 2;
        b[3] = 2;
        b[4] = 2;
        b[5] = 1;
        b[6] = 1;
        b[7] = 1;
        b[8] = 1;

        IntegerProfile a = new IntegerProfile(b);
        System.out.println(a.sizeLongestPlateau());

    }
}