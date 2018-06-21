/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        int[] profile = new int[7];
        profile[0] = 1;
        profile[1] = 1;
        profile[2] = 2;
        profile[3] = 3;
        profile[4] = 3;
        profile[5] = 3;
        profile[6] = 1;
        IntegerProfile Profile1 = new IntegerProfile(profile);
        System.out.println(Profile1.sizeLongestPlateau());
    }
}