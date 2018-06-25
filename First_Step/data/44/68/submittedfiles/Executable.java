/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] t = new int [4];
        t[0]= 2;
        t[1]= 3;
        t[2]= 4;
        t[3]= 2;
        Scores x = new Scores (t);
        System.out.println(x.podium());
    }
}