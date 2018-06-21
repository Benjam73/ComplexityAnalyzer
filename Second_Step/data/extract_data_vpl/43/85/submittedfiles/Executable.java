/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        int [] prof = new int [10];
        prof[0]=4;
        prof[1]=4;
        prof[2]=50;
        prof[3]=2;
        prof[4]=2;
        prof[5]=2;
        prof[6]=4;
        prof[7]=8;
        prof[8]=5;
        prof[9]=5;
        IntegerProfile profile = new IntegerProfile(prof);
        System.out.println(profile.sizeLongestPlateau());

    }
}