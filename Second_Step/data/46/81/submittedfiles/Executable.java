/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    int[] yepa = new int[5];
    yepa[0]= 3;
    yepa[1]= 2;
    yepa[2]=-3;
    yepa[3]=-2;
    yepa[4]=5;
    
    
    System.out.println(Tools.fastNumberOfCancellations(yepa));
    System.out.println(Tools.numberOfCancellations(yepa));
    }
}