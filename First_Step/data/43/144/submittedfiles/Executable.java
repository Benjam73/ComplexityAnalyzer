/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] prof =  new int[9];
        prof[0]=2;
        prof[1]=3;
        prof[2]=3;
        prof[3]=1;
        prof[4]=1;
        prof[5]=1;
        prof[6]=5;
        prof[7]=3;
        prof[8]=3;
        IntegerProfile profile1 = new IntegerProfile(prof);
        System.out.println(""+profile1.sizeLongestPlateau());
        
    }
}