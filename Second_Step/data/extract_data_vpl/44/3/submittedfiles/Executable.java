/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        
        int[] patate = new int[5];
        patate[0] = 18;
        patate[1] = 97;
        patate[2] = 6;
        patate[3] = 5;
        patate[4] = 692;
        
        Scores patateCuite = new Scores(patate);
        
       patateCuite.podium();
        
    }
}