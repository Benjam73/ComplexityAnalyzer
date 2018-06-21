/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        
        int[] tableau = {10,9,1,4};
        Scores scores = new Scores(tableau);
        System.out.println(scores.max());
        System.out.println(scores.podium()[0]);
        System.out.println(scores.podium()[1]);
        System.out.println(scores.podium()[2]);
    }
}