/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] profile1 = new int[12];
        profile1[0] = 1;
        profile1[1]= 2;
        profile1[2] = 2;
        profile1[3] = 2;
        profile1[4] = 2;
        profile1[5] = 4;
        profile1[6] = 2;
        profile1[7] = 2;
        profile1[8] = 2;
        profile1[9] = 2;
        profile1[10] = 2;
        profile1[11] = 2;
        IntegerProfile ip = new IntegerProfile(profile1);
        System.out.println(ip.sizeLongestPlateau());
    }
}