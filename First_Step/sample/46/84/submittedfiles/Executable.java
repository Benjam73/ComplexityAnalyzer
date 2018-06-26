/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tab = {-8,4,8,-5,6,-6};
        System.out.println("Nombre de paires égales à 0 : " + Tools.fastNumberOfCancellations(tab) );
    }
}