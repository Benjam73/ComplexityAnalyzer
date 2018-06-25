/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int table[]=new int [7];
        
        table[0]=5;
        table[1]=6;
        table[2]=3;
        table[3]=-5;
        table[4]=2;
        table[5]=7;
        table[6]=4;
        
        int number=Tools.numberOfCancellations(table);  
        System.out.println(number);
    }
}