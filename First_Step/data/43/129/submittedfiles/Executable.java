/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] a = new int[2];
        a[0] = 2;
        a[1] = 2;
        IntegerProfile tabl = new IntegerProfile (a);
        System.out.println("size " + tabl.sizeLongestPlateau());

    }
}