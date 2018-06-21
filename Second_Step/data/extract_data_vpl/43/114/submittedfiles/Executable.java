/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        int []t = new int [5];
        t[0]=1;
        t[1]=1;
        t[2]=2;
        t[3]=3;
        t[4]=1;
        IntegerProfile p = new IntegerProfile(t);
        System.out.println(""+p.sizeLongestPlateau());
    
    }
}