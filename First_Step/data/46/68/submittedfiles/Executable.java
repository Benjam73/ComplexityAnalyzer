/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        Tools t = new Tools();
        int[]tab = {1,9,-4,5,-3,-5,0,-6,-7,8,-9};
        //System.out.println(t.numberOfCancellations(tab));
        System.out.println(t.fastNumberOfCancellations(tab));
    }
}