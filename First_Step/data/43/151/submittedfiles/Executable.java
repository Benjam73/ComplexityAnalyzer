/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    private int [] sequence;
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        this.sequence = new int [5,2,2,1];
        return sequence.sizeLongestPlateau();

    }
}