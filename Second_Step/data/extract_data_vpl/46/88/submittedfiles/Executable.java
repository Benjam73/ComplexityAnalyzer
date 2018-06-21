/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        Tools tool = new Tools();
        int[] tab={1,-1};
        int nbr=tool.numberOfCancellations(tab);
        System.out.println(nbr);

    }
}