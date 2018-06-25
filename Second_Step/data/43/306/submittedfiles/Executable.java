/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] plateau=new int[4];
        plateau[0]=1;
        plateau[1]=2;
        plateau[2]=3;
        plateau[3]=4;
        IntegerProfile plat =new IntegerProfile(plateau);
        System.out.println( plat.sizeLongestPlateau() );
        //I can test my class here: create instances and call the method(s), check the results
        //TODO

    }
}