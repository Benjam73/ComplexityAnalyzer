/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[]t = new int[6];
        t[0]=3;
        t[1]=-5;
        t[2]=1;
        t[3]=-3;
        t[4]=-2;
        t[5]=5;
        Tools.fastNumberOfCancellations(t);

    }
}