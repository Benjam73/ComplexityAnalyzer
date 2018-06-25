/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
    test1();
    }
    public static void test1(){
        
        int[] profile=new int[]{2,3,3,1,1,1,5,3,3};
        IntegerProfile test=new IntegerProfile(profile);
        System.out.println(test.sizeLongestPlateau());
        


    }
}