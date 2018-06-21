/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] a = new int[9];
            a[0] = 6;
            a[1] = 5;
            a[2] = 5;
            a[3] = 3;
            a[4] = 3;
            a[5] = 3;
            a[6] = 3;
            a[7] = 1;
            a[8] = 2;
        IntegerProfile b = new IntegerProfile(a);
        System.out.println(b.sizeLongestPlateau());

    }
}