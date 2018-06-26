/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] table = new int[9];
        table[0] =5;
        table[1] =10;
        table[2] =2;
        table[3] =-2;
        table[4] =4;
        table[5] =7;
        table[6] =8;
        table[7] =1;
        table[8] =-5;
        System.out.println(Tools.numberOfCancellations(table));
        System.out.println (Tools.fastNumberOfCancellations(table));

    }
}