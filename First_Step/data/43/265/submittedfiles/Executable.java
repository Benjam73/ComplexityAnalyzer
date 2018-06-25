/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] profile = new int[4];
        profile[0]=1;
        profile[1]=2;
        profile[2]=3;
        profile[3]=4;
        IntegerProfile pro= new IntegerProfile(profile);
        System.out.println( pro.sizeLongestPlateau());
        //I can test my class here: create instances and call the method(s), check the results
        //TODO

    }
}