
/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int [] plateau = new int[9];
        
        plateau[0]=2;
        plateau[1]=3;
        plateau[2]=3;
        plateau[3]=1;
        plateau[4]=1;
        plateau[5]=1;
        plateau[6]=5;
        plateau[7]=3;
        plateau[8]=3;
        
        IntegerProfile test1 = new IntegerProfile(plateau);
        System.out.println(test1.sizeLongestPlateau());
        
        
    }
}