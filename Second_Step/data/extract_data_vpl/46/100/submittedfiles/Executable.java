/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] table = new int[6]; 
        table[0]=-1;
        table[1]=0;
        table[2]=11;
        table[3]=-22;
        table[4]=5;
        table[5]=2;
        boolean trouve =Tools.isPresent(table,-1);
        int counter = Tools.fastNumberOfCancellations( table);
        System.out.println( trouve);
        System.out.println( counter);
        
             

    }
}