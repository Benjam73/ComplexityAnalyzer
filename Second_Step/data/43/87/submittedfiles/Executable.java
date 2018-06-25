/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] t = new int[]{2,6,1,3,3,2,2,2,2,1,1,4,4,4};//taile:14
        int[] a = new int[]{};
        IntegerProfile x = new IntegerProfile(t);
        int y = x.sizeLongestPlateau();
        System.out.println(y);

    }
}