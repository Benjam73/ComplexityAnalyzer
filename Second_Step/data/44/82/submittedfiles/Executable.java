/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 5;
        a[2] = 47;
        a[3] = 10;
        a[4] = 0;
        Scores b = new Scores(a);
        System.out.println(b.podium()[0]);
        System.out.println(b.podium()[1]);
        System.out.println(b.podium()[2]);

    }
}