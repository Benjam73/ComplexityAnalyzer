/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] table = {1,6,8,3,9,0,0,21};
        Scores scores = new Scores(table);
        scores.podium();
        
    }
}