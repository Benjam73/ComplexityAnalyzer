/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] t = {2,3,3,1,1,1,5,4,4,4,4,3,3,3};
        IntegerProfile p = new IntegerProfile(t);
        System.out.println(p.sizeLongestPlateau());
    }
}