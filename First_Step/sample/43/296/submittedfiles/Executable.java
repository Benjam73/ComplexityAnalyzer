/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] p = new int[]{1,2,2,5,6,6,7,7,7};
        IntegerProfile pro = new IntegerProfile(p);
        System.out.println(pro.sizeLongestPlateau());

    }
}