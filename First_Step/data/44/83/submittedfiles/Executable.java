/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[]test = new int[5];
        test[0]= 3;
        test[1]= 16;
        test[2]= 12;
        test[3]= 17;
        test[4]= 17;
        Scores test1= new Scores(test);
        System.out.println(test1.podium());
        
    }
}