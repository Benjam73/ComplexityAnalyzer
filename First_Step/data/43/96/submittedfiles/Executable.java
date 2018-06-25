/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] t= new int[4];
        t[0]= 1;
        t[1]= 1;
        t[2]= 1;
        t[3]= 2;        
        IntegerProfile x = new IntegerProfile(t);
        System.out.println(x.sizeLongestPlateau());

    }
}