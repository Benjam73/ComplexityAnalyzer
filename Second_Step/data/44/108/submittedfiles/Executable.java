/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        Scores best = new Scores(new int[]{1,5,9,7,3,4});
        System.out.println(best.podium());
    }
}